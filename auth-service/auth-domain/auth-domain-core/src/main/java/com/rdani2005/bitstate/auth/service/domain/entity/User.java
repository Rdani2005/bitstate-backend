package com.rdani2005.bitstate.auth.service.domain.entity;

import com.rdani2005.bitstate.auth.service.domain.exception.AuthServiceException;
import com.rdani2005.bitstate.domain.entity.AggregateRoot;
import com.rdani2005.bitstate.domain.valueobject.UserId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

import static com.rdani2005.bitstate.domain.DomainConstants.UTC;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class User extends AggregateRoot<UserId> {
    private String name;
    private String lastName;
    private String password;
    private String email;
    private ZonedDateTime birthDay;
    private ZonedDateTime createdAt;
    private UserRole userRole;
    public void validateAndInitializeUser() {
        validateUser();
        initializeUser();
    }

    private void validateUser() {
        validateName();
        validateLastName();
        validateEmail();
        validatePassword();
    }

    private void validateName() {
        if (this.name.isEmpty()) {
            throw new AuthServiceException("Name cannot be null");
        }
    }

    private void validateLastName() {
        if (this.lastName.isEmpty()) {
            throw new AuthServiceException("Last Name cannot be null");
        }
    }

    private void validatePassword() {
        validatePasswordLength();
        validateCapitalLetterOnPassword();
        validateNumbersOnPassword();
        validateSpecialCharacterOnPassword();
    }

    private void validatePasswordLength() {
        if (this.password.isEmpty() || this.password.length() < 8) {
            throw new AuthServiceException("Password length should be 8 characters");
        }
    }

    private void validateCapitalLetterOnPassword() {
        if (
                !Pattern
                .compile("[A-Z]")
                .matcher(this.password).find()
        ) {
            throw new AuthServiceException("Password should have at least one capital letter.");
        }
    }

    private void validateNumbersOnPassword() {
        if (
                !Pattern
                .compile("[0-9]")
                .matcher(this.password).find()
        ) {
            throw new AuthServiceException("Password should have at least one number");
        }
    }

    private void validateSpecialCharacterOnPassword() {
        if (
                !Pattern
                .compile("[!@#$%^&*()-_=+\\[\\]{}|;:'\",.<>/?`~]")
                .matcher(this.password)
                .find()
        ) {
            throw new AuthServiceException("Password should have at least one special character");
        }
    }

    private void validateEmail() {
        if (
                !Pattern
                .compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$")
                .matcher(this.email).find()
        ) {
            throw new AuthServiceException("Email is not valid.");
        }
    }
    private void initializeUser() {
        super.setId(new UserId(UUID.randomUUID()));
        this.setCreatedAt(ZonedDateTime.now(ZoneId.of(UTC)));
    }
}
