package com.apirest.services;

import com.apirest.dao.PermisoDao;
import com.apirest.dao.PermisoDao;
import com.apirest.models.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoService {
    @Autowired
    PermisoDao permisoDao;
    public List<Permiso> getAllPermiso(){
        return permisoDao.getAllPermiso();
    }

    public Permiso getPermisoById(Long id){
        return permisoDao.getPermisoById(id);
    }


    public Permiso crearPermiso(Permiso permiso){

        return permisoDao.crearPermiso(permiso);
    }

    public Permiso actualizarPermiso(Permiso permiso, Long id){

        return permisoDao.actualizarPermiso(permiso);
    }

    public void deletePermiso( Long id){
        permisoDao.deletePermiso(id);
    }
}
