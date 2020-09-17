package io.pdiben.eventsourcingcqrs.commandmodel;

import java.util.HashMap;
import java.util.Map;

public class UserWriteRepository {
    private Map<String, User> store = new HashMap();

    public void addUser(String userId, User user) {

    }

    public User getUser(String userId) {
        return new User();
    }
}
