package io.pdiben.eventsourcingcqrs.querymodel;

import java.util.HashMap;
import java.util.Map;

public class UserReadRepository {
    private Map<String, UserAddress> userAddress = new HashMap<>();
    private Map<String, UserContact> userContact = new HashMap<>();
    // accessors and mutators

    public UserContact getUserContact(String userId) {
        return new UserContact();
    }
}
