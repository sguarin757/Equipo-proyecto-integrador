package service;

import models.user;
import java.util.List;

public interface UserService {
    user create(user userModel);

    boolean update(user updateUser);

    boolean delete(Integer userId);

    user findById(Integer userId);

    List<user> findAll();
}

