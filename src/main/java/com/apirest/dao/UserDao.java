package com.apirest.dao;

import com.apirest.models.User;
import java.util.List;

public interface UserDao {


    List<User> getAllUser();

    User getUserById(Long id);


    User crearUser(User user);

    User actualizarUser(User user);

    void deleteUser(Long id);
}
