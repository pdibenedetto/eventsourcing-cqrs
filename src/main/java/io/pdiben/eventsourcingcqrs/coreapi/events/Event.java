package io.pdiben.eventsourcingcqrs.coreapi.events;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import java.util.UUID;

public class Event {
    public final UUID id = UUID.randomUUID();
    public final OffsetDateTime utcDateCreated = OffsetDateTime.now(ZoneId.of(ZoneOffset.UTC.getId()));
}
