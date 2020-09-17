package io.pdiben.eventsourcingcqrs.commandmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Contact {
    private String type;
    private String detail;
}
