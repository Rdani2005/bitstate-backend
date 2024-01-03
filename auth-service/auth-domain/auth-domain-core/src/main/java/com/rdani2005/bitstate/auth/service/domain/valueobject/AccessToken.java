package com.rdani2005.bitstate.auth.service.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class AccessToken {
    private String token;
    private ZonedDateTime expireTime;
}
