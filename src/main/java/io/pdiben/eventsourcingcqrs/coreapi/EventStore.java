package io.pdiben.eventsourcingcqrs.coreapi;

import io.pdiben.eventsourcingcqrs.coreapi.events.Event;
import io.pdiben.eventsourcingcqrs.coreapi.events.UserCreatedEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventStore {
    private final Map<String, List<Event>> eventStoreRepository = new HashMap<>();

    public void addUser(String userId, UserCreatedEvent userCreatedEvent) {
        List<Event> userEventCollection = new ArrayList<>(eventStoreRepository.get(userId));
        userEventCollection.add(userCreatedEvent);
        eventStoreRepository.put(userId, userEventCollection);
    }

    public void addEvent(String userId, Event event) {

    }
}
