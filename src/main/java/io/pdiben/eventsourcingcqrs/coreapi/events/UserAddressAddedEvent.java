package io.pdiben.eventsourcingcqrs.coreapi.events;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAddressAddedEvent extends Event {
    private String city;
    private String state;
    private String postCode;
}
