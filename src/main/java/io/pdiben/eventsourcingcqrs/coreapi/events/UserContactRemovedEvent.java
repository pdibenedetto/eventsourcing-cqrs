package io.pdiben.eventsourcingcqrs.coreapi.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserContactRemovedEvent extends Event {
    private String contactType;
    private String contactDetails;
}
