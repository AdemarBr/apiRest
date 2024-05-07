package com.apirest.dao.imp;

import com.apirest.dao.UserDao;
import com.apirest.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<User> getAllUser(){
        String hql1 = "FROM User as u " ;
        return (List<User>) entityManager.createQuery(hql1).getResultList();
    };

    @Transactional
    @Override
    public User getUserById(Long id){
        return entityManager.find(User.class, id);

    };

    @Transactional
    @Override
    public User crearUser(User user){
        entityManager.merge(user);
        return  user;
    };

    @Transactional
    @Override
    public User actualizarUser(User user){
        entityManager.merge(user);
        return  user;

    };

    @Transactional
    @Override
    public void deleteUser(Long id){
        User user = getUserById(id);
        entityManager.remove(user);

    };
}
