package io.pdiben.eventsourcingcqrs.commandmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Set<Contact> contacts;
    private Set<Address> addresses;
}
