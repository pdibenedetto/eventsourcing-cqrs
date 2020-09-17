package io.pdiben.eventsourcingcqrs.coreapi;

import io.pdiben.eventsourcingcqrs.commandmodel.Address;
import io.pdiben.eventsourcingcqrs.commandmodel.Contact;
import io.pdiben.eventsourcingcqrs.commandmodel.User;
import io.pdiben.eventsourcingcqrs.coreapi.events.UserContactRemovedEvent;
import io.pdiben.eventsourcingcqrs.coreapi.events.UserCreatedEvent;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

public class UserService {
    private EventStore eventStoreRepository;

    public UserService(EventStore eventStoreRepository) {
        this.eventStoreRepository = eventStoreRepository;
    }

    public void createUser(String userId, String firstName, String lastName) {
        eventStoreRepository.addUser(userId, new UserCreatedEvent(userId, firstName, lastName));
    }

    public void updateUser(String userId, Set<Contact> contacts, Set<Address> addresses) {
        User user = UserUtility.recreateUserState(eventStoreRepository, userId);
        user.getContacts().stream()
                .filter(c -> !contacts.contains(c))
                .forEach(c -> eventStoreRepository
                                .addEvent(userId, new UserContactRemovedEvent(c.getType(), c.getDetail())));

        // TODO: Now add contacts

        // TODO: Now remove addresses not in new incoming set

        // TODO: Now add addresses
    }


    public Set<Contact> getContactByType(String userId, String contactType) {
        User user = UserUtility.recreateUserState(eventStoreRepository, userId);
        return user.getContacts().stream()
                .filter(c -> c.getType().equals(contactType))
                .collect(Collectors.toSet());
    }

    public Set<Address> getAddressByRegion(String userId, String state) throws Exception {
        User user = UserUtility.recreateUserState(eventStoreRepository, userId);
        return user.getAddresses().stream()
                .filter(a -> a.getState().equals(state))
                .collect(Collectors.toSet());
    }
}
