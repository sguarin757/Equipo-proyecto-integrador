package Repository.impl;

import Repository.UserRepository;
import models.user;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryInMemory implements UserRepository {

    private List<user> users;
    private Integer nextUserId;

    public UserRepositoryInMemory() {
        this.users = new ArrayList<>();
        this.nextUserId = 1;
    }

    @Override
    public user createUser(user userModel) {
        if (userModel == null) {
            return null;
        }
        if (findByUsername(userModel.getUsername())) {
            return null;
        }
        userModel.setUser_id(nextUserId++);
        users.add(userModel);
        return userModel;
    }

    @Override
    public boolean deleteUser(Integer userId) {
        user userModel = findById(userId);
        if (userModel == null) {
            return false;
        }
        return users.remove(userModel);
    }

    @Override
    public boolean updateUser(user userModel) {
        if (userModel == null) {
            return false;
        }
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUser_id() == userModel.getUser_id()) {
                users.set(i, userModel);
                return true;
            }
        }
        return false;
    }

    @Override
    public user findById(Integer userId) {
        if (userId == null) {
            return null;
        }
        for (user userModel : users) {
            if (userModel.getUser_id() == userId) {
                return userModel;
            }
        }
        return null;
    }

    @Override
    public boolean findByUsername(String username) {
        if (username == null || username.isBlank()) {
            return false;
        }
        for (user userModel : users) {
            if (username.equals(userModel.getUsername())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<user> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public boolean existsById(Integer userId) {
        return findById(userId) != null;
    }

    @Override
    public boolean existsByUsername(String username) {
        return findByUsername(username);
    }
}

