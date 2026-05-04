package Repository;

import models.user;
import java.util.List;

public interface UserRepository {
    user createUser(user userModel);

    boolean deleteUser(Integer userId);

    boolean updateUser(user userModel);

    user findById(Integer userId);

    boolean findByUsername(String username);

    List<user> findAll();

    boolean existsById(Integer userId);

    boolean existsByUsername(String username);
}

