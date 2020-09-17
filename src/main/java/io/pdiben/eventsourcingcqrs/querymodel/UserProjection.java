package io.pdiben.eventsourcingcqrs.querymodel;

import io.pdiben.eventsourcingcqrs.coreapi.queries.AddressByReqionQuery;
import io.pdiben.eventsourcingcqrs.coreapi.queries.ContactByTypeQuery;

public class UserProjection {
    private UserReadRepository userReadRepository;

    public UserProjection(UserReadRepository userReadRepository) {
        this.userReadRepository = userReadRepository;
    }

    public Set<Contact> handle(ContactByTypeQuery query) {
        UserContact userContact = userReadRepository.getUserContact(query.getUserId())
    }

    public Set<Address> handle(AddressByReqionQuery query) {
        UserAddress userAddress = userReadRepository.getUserAddress(query.getState());
    }
}
