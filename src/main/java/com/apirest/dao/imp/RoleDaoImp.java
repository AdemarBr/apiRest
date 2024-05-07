package com.apirest.dao.imp;

import com.apirest.dao.RoleDao;
import com.apirest.models.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class RoleDaoImp implements RoleDao {


    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<Role> getAllRole(){
        String hql1 = "FROM Role as u " ;
        return (List<Role>) entityManager.createQuery(hql1).getResultList();
    };

    @Transactional
    @Override
    public Role getRoleById(Long id){
        return entityManager.find(Role.class, id);

    };

    @Transactional
    @Override
    public Role crearRole(Role role){
        entityManager.merge(role);
        return  role;
    };

    @Transactional
    @Override
    public Role actualizarRole(Role role){
        entityManager.merge(role);
        return  role;

    };

    @Transactional
    @Override
    public void deleteRole(Long id){
        Role role = getRoleById(id);
        entityManager.remove(role);

    };

}
