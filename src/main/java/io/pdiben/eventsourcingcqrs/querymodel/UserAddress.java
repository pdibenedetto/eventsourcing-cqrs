package io.pdiben.eventsourcingcqrs.querymodel;

import java.util.HashMap;

public class UserAddress {
    private Map<String, Set<Address>> addressByRegion = new HashMap<>();
}
