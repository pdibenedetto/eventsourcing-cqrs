package io.pdiben.eventsourcingcqrs.querymodel;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class UserContact {
    private Map<String, Set<Contact>> contactByType = new HashMap<>();

}
