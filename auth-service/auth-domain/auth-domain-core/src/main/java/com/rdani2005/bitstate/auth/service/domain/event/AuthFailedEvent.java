package com.rdani2005.bitstate.auth.service.domain.event;

import com.rdani2005.bitstate.auth.service.domain.entity.User;

import java.time.ZonedDateTime;

public class AuthFailedEvent extends AuthEvent {
    public AuthFailedEvent(
            User user,
            ZonedDateTime zonedDateTime
    ) {
        super(user, zonedDateTime);
    }
}
