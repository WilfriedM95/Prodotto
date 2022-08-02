package com.aizoon.security;

<<<<<<< HEAD
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

=======
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
>>>>>>> f9e649d14d216e1456a56a8f86155a91c10e13fe
