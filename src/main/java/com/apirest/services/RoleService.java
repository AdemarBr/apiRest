package com.apirest.services;

import com.apirest.dao.RoleDao;
import com.apirest.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleDao roleDao;
    public List<Role> getAllRole(){
        return roleDao.getAllRole();
    }

    public Role getRoleById( Long id){
        return roleDao.getRoleById(id);
    }


    public Role crearRole( Role role){

        return roleDao.crearRole(role);
    }

    public Role actualizarRole( Role role, Long id){

        return roleDao.actualizarRole(role);
    }

    public void deleteRole( Long id){
        roleDao.deleteRole(id);
    }
}
