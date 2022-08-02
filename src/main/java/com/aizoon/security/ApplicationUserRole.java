package com.aizoon.security;

import com.google.common.collect.Sets;

import java.util.Set;
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(permissions);

    private final Set<ApplicationUserPermission>
            permissions;

ApplicationUserRole(Set<ApplicationUserPermission> permissions){
    this.permissions=permissions;
}

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
