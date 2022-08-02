package com.aizoon.security;

import java.util.Set;

import com.google.common.collect.Sets;

public enum ApplicationUserRole {

	  STUDENT(Sets.newHashSet()),
	    ADMIN(Sets.newHashSet(ApplicationUserPermission.COURSE_READ,
	    		ApplicationUserPermission.COURSE_WRITE,
	    		ApplicationUserPermission.STUDENT_WRITE,
	    		ApplicationUserPermission.STUDENT_READ)),
	ADMINTRAINEE(Sets.newHashSet(ApplicationUserPermission.COURSE_READ,
    		ApplicationUserPermission.STUDENT_READ));


	    private final Set<ApplicationUserPermission>
	            permissions;

	ApplicationUserRole(Set<ApplicationUserPermission> permissions){
	    this.permissions=permissions;
	}

	    public Set<ApplicationUserPermission> getPermissions() {
	        return permissions;
	    }
	}
