package io.pdiben.eventsourcingcqrs.coreapi.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCreatedEvent extends Event {
    private String userId;
    private String firstName;
    private String lastName;
}
