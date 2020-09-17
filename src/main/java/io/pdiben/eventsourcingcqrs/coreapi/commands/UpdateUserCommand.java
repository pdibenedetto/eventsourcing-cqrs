package io.pdiben.eventsourcingcqrs.coreapi.commands;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class UpdateUserCommand {
    private String userId;
    private Set<Address> addresses;
    private Set<Contact> contacts;

}
