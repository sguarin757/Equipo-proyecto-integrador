package service.impl;

import Repository.UserRepository;
import service.UserService;
import models.user;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public user create(user userModel) {
        return userRepository.createUser(userModel);
    }

    @Override
    public boolean update(user updateUser) {
        return userRepository.updateUser(updateUser);
    }

    @Override
    public boolean delete(Integer userId) {
        return userRepository.deleteUser(userId);
    }

    @Override
    public user findById(Integer userId) {
        return userRepository.findById(userId);
    }

    @Override
    public List<user> findAll() {
        return userRepository.findAll();
    }
}

