package io.pdiben.eventsourcingcqrs.coreapi.events;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserContactAddedEvent extends Event {
    private String contactType;
    private String contactDetails;
}