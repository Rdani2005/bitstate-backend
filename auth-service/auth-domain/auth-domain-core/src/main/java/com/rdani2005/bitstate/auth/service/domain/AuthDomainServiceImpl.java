package com.rdani2005.bitstate.auth.service.domain;


import com.rdani2005.bitstate.auth.service.domain.entity.User;
import com.rdani2005.bitstate.auth.service.domain.event.AuthUserCreatedEvent;
import com.rdani2005.bitstate.auth.service.domain.event.AuthUserDeletedEvent;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.rdani2005.bitstate.domain.DomainConstants.UTC;

public class AuthDomainServiceImpl implements AuthDomainService {
    @Override
    public AuthUserCreatedEvent validateAndInitializeUser(User user) {
        user.validateAndInitializeUser();
        return new AuthUserCreatedEvent(
                user,
                ZonedDateTime.now(ZoneId.of(UTC))
        );
    }

    @Override
    public AuthUserDeletedEvent deleteUser(User user) {
        return new AuthUserDeletedEvent(
                user,
                ZonedDateTime.now(ZoneId.of(UTC))
        );
    }
}
