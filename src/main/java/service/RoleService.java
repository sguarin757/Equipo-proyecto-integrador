package service;

import models.Role;
import java.util.List;

public interface RoleService {
    Role create(Role role);

    boolean update(Role updateRole);

    boolean delete(Long roleId);

    Role findById(Long roleId);

    List<Role> findAll();
}

