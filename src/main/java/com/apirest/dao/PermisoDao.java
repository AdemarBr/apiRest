package com.apirest.dao;

import com.apirest.models.Permiso;

import java.util.List;

public interface PermisoDao {

    List<Permiso> getAllPermiso();

    Permiso getPermisoById(Long id);


    Permiso crearPermiso(Permiso permiso);

    Permiso actualizarPermiso(Permiso permiso);

    void deletePermiso(Long id);
}
