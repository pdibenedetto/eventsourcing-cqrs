package io.pdiben.eventsourcingcqrs.commandmodel;

import io.pdiben.eventsourcingcqrs.querymodel.UserContact;
import io.pdiben.eventsourcingcqrs.querymodel.UserReadRepository;

import java.util.*;

public class UserProjector {
    private UserReadRepository userReadRepository;

    public UserProjector(UserReadRepository userReadRepository) {
        this.userReadRepository = userReadRepository;
    }

    public void project(User user) {
        UserContact userContact = Optional.ofNullable(
                userReadRepository.getUserContact(user.getUserId()))
                .orElse(new UserContact());

        Map<String, Set<Contact>> contactByType = new HashMap<>();

        for (Contact contact : user.getContacts()) {
            Set<Contact> contacts = Optional.ofNullable(
                    contactByType.get(contact.getType()))
                    .orElse(new HashSet<>());
            contacts.add(contact);
            contactsByType.put(contact.getType(), contacts);
            )
        }

    }
}
