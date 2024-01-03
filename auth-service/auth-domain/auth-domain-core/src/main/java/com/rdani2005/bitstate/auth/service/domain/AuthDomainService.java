package com.rdani2005.bitstate.auth.service.domain;

import com.rdani2005.bitstate.auth.service.domain.entity.User;
import com.rdani2005.bitstate.auth.service.domain.event.AuthUserCreatedEvent;
import com.rdani2005.bitstate.auth.service.domain.event.AuthUserDeletedEvent;

public interface AuthDomainService {
    AuthUserCreatedEvent validateAndInitializeUser(User user);
    AuthUserDeletedEvent deleteUser(User user);
}
