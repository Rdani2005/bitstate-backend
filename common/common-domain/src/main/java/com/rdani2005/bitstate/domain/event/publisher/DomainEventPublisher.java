package com.rdani2005.bitstate.domain.event.publisher;

import com.rdani2005.bitstate.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
