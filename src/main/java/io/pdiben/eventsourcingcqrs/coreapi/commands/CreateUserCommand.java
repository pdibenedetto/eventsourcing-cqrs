package io.pdiben.eventsourcingcqrs.coreapi.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateUserCommand {
    private String userId;
    private String firstName;
    private String lastName;
}
