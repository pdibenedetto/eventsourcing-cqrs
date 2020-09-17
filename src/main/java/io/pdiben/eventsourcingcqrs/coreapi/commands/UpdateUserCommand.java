package io.pdiben.eventsourcingcqrs.coreapi.commands;

import io.pdiben.eventsourcingcqrs.commandmodel.Address;
import io.pdiben.eventsourcingcqrs.commandmodel.Contact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class UpdateUserCommand {
    private String userId;
    private Set<Address> addresses;
    private Set<Contact> contacts;
}
