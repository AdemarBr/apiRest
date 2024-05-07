package com.apirest.controllers;

import com.apirest.models.Permiso;
import com.apirest.services.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/permiso")
public class PermisoController {



    @Autowired
    PermisoService permisoService;


    @GetMapping()
    List<Permiso> getAllUser(){
        return  permisoService.getAllPermiso();
    }

    @GetMapping("/{id}")
    Permiso getUserById(@PathVariable Long id){
        return permisoService.getPermisoById(id);
    }


    @PostMapping()
    Permiso crearUser(@RequestBody Permiso permiso){

        return permisoService.crearPermiso(permiso);
    }

    @PutMapping("/{id}")
    Permiso actualizarUser(@RequestBody Permiso permiso, @PathVariable Long id){

        return permisoService.actualizarPermiso(permiso, id);
    }

    @DeleteMapping ("/{id}")
    void deleteUser(@PathVariable Long id){
        permisoService.deletePermiso(id);

    }
}
