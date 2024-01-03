package com.rdani2005.bitstate.auth.service.domain.exception;

public class OAuthClientException extends AuthServiceException{
    public OAuthClientException(String message) {
        super(message);
    }

    public OAuthClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
