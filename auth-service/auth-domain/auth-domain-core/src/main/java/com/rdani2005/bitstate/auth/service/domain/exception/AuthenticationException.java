package com.rdani2005.bitstate.auth.service.domain.exception;

import com.rdani2005.bitstate.domain.exception.DomainException;

public class AuthenticationException extends AuthServiceException {
    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
