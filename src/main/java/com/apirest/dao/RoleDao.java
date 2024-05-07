package com.apirest.dao;

import com.apirest.models.Role;
import com.apirest.models.User;

import java.util.List;

public interface RoleDao {
    List<Role> getAllRole();

    Role getRoleById(Long id);


    Role crearRole(Role role);

    Role actualizarRole(Role role);

    void deleteRole(Long id);
}
