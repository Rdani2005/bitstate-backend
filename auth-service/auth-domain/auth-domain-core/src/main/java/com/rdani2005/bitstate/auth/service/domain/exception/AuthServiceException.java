package com.rdani2005.bitstate.auth.service.domain.exception;

import com.rdani2005.bitstate.domain.exception.DomainException;

public class AuthServiceException extends DomainException {
    public AuthServiceException(String message) {
        super(message);
    }

    public AuthServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
