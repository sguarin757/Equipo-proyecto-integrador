package Repository;

import models.Role;
import java.util.List;

public interface RoleRepository {
    Role createRole(Role role);

    boolean deleteRole(Long roleId);

    boolean updateRole(Role role);

    Role findById(Long roleId);

    boolean finByName(String name);

    List<Role> findAll();

    boolean existsById(Long roleId);

    boolean existsByName(String name);
}

