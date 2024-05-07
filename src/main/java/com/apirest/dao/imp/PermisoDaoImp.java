package com.apirest.dao.imp;

import com.apirest.dao.PermisoDao;
import com.apirest.models.Permiso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Transactional
@Repository
public class PermisoDaoImp implements PermisoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<Permiso> getAllPermiso(){
        String hql1 = "FROM Permiso as u " ;
        return (List<Permiso>) entityManager.createQuery(hql1).getResultList();
    };

    @Transactional
    @Override
    public Permiso getPermisoById(Long id){
        return entityManager.find(Permiso.class, id);

    };

    @Transactional
    @Override
    public Permiso crearPermiso(Permiso user){
        entityManager.merge(user);
        return  user;
    };

    @Transactional
    @Override
    public Permiso actualizarPermiso(Permiso user){
        entityManager.merge(user);
        return  user;

    };

    @Transactional
    @Override
    public void deletePermiso(Long id){
        Permiso user = getPermisoById(id);
        entityManager.remove(user);

    };
    
    
}
