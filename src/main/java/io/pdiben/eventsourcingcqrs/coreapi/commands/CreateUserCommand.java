package io.pdiben.eventsourcingcqrs.coreapi.commands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserCommand {
    private String userId;
    private String firstName;
    private String lastName;
}
