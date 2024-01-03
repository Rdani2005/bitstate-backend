package com.rdani2005.bitstate.auth.service.domain.event;

import com.rdani2005.bitstate.auth.service.domain.entity.User;
import com.rdani2005.bitstate.domain.event.DomainEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
public abstract class AuthEvent implements DomainEvent<User> {
    private final User user;
    private final ZonedDateTime zonedDateTime;
}
