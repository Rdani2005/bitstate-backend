package com.rdani2005.bitstate.auth.service.domain.event;


import com.rdani2005.bitstate.auth.service.domain.entity.User;

import java.time.ZonedDateTime;

public class AuthUserDeletedEvent extends AuthEvent {
    public AuthUserDeletedEvent(User user, ZonedDateTime zonedDateTime) {
        super(user, zonedDateTime);
    }
}
