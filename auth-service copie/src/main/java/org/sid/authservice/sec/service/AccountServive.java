package org.sid.authservice.sec.service;

import org.sid.authservice.sec.entities.AppRole;
import org.sid.authservice.sec.entities.AppUser;

import java.util.List;

public interface AccountServive {

    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
