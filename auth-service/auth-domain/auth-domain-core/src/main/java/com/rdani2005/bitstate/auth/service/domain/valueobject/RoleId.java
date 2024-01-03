package com.rdani2005.bitstate.auth.service.domain.valueobject;

import com.rdani2005.bitstate.domain.valueobject.BaseId;

import java.util.UUID;

public class RoleId extends BaseId<UUID> {
    public RoleId(UUID value) {
        super(value);
    }
}
