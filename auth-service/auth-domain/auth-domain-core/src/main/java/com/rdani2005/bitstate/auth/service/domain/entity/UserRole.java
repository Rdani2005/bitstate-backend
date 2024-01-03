package com.rdani2005.bitstate.auth.service.domain.entity;

import com.rdani2005.bitstate.auth.service.domain.valueobject.RoleId;
import com.rdani2005.bitstate.domain.entity.BaseEntity;
import com.rdani2005.bitstate.domain.valueobject.UserPermissions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserRole extends BaseEntity<RoleId> {
    private String name;
    private String description;
    private List<UserPermissions> permissions;
}
