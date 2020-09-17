package io.pdiben.eventsourcingcqrs.commandmodel;

import io.pdiben.eventsourcingcqrs.coreapi.commands.CreateUserCommand;
import io.pdiben.eventsourcingcqrs.coreapi.commands.UpdateUserCommand;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserAggregate {
    private UserWriteRepository userWriteRepository;

    public User handleCreateUserCommand(CreateUserCommand createUserCommand) {
        User user = new User(createUserCommand.getUserId(),
                             createUserCommand.getFirstName(),
                             createUserCommand.getLastName());

        userWriteRepository.addUser(user.getUserId(), user);
        return user;
    }

    public User handleUpdateUserCommand(UpdateUserCommand updateUserCommand) {
        User user = userWriteRepository.getUser(updateUserCommand.getUserId());
        user.setAddresses(updateUserCommand.getAddresses());
        user.setContacts(updateUserCommand.getContacts());
        userWriteRepository.addUser(user.getUserId(), user);
        return user;
    }

}
