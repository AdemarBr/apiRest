package com.apirest.controllers;

import com.apirest.models.Role;
import com.apirest.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/role")
public class RoleController {


    @Autowired
    RoleService roleService;


    @GetMapping()
    List<Role> getAllRole(){
        return  roleService.getAllRole();
    }

    @GetMapping("/{id}")
    Role getRoleById(@PathVariable Long id){
        return roleService.getRoleById(id);
    }


    @PostMapping()
    Role crearRole(@RequestBody Role role){

        return roleService.crearRole(role);
    }

    @PutMapping("/{id}")
    Role actualizarRole(@RequestBody Role role,@PathVariable Long id){

        return roleService.actualizarRole(role, id);
    }

    @DeleteMapping ("/{id}")
    void deleteRole(@PathVariable Long id){
        roleService.deleteRole(id);

    }
    
}
