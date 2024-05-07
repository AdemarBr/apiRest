package com.apirest.services;

import com.apirest.dao.UserDao;
import com.apirest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {



    @Autowired
    UserDao userDao;
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    public User getUserById( Long id){
        return userDao.getUserById(id);
    }


    public User crearUser( User user){

        return userDao.crearUser(user);
    }

    public User actualizarUser( User user, Long id){

        return userDao.actualizarUser(user);
    }

     public void deleteUser( Long id){
        userDao.deleteUser(id);
    }
}
