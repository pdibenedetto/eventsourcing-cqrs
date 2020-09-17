package io.pdiben.eventsourcingcqrs.coreapi;

import io.pdiben.eventsourcingcqrs.commandmodel.User;

public class UserUtility {
    public static User recreateUserState(EventStore eventStoreRepo, String userId) {
        return new User();
    }
}
