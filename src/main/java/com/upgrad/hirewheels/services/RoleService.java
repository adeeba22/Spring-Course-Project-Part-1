package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dto.RoleDTO;
import com.upgrad.hirewheels.entities.Role;

import java.util.List;

public interface RoleService {

    public Role insertIntoRoleTable(Role role);
    public List<Role> getRoleTable();
}
