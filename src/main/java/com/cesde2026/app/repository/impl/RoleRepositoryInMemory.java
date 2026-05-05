package Repository.impl;

import Repository.RoleRepository;
import models.Role;
import java.util.ArrayList;
import java.util.List;

public class RoleRepositoryInMemory implements RoleRepository {

    private List<Role> roles;
    private Long nextRoleId;

    public RoleRepositoryInMemory() {
        this.roles = new ArrayList<>();
        this.nextRoleId = 1L;
    }

    @Override
    public Role createRole(Role role) {
        if (role == null) {
            return null;
        }
        if (finByName(role.getName())) {
            return null;
        }
        role.setRoleId(nextRoleId++);
        roles.add(role);
        return role;
    }

    @Override
    public boolean deleteRole(Long roleId) {
        Role role = findById(roleId);
        if (role == null) {
            return false;
        }
        return roles.remove(role);
    }

    @Override
    public boolean updateRole(Role role) {
        if (role == null || role.getRoleId() == null) {
            return false;
        }
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get(i).getRoleId().equals(role.getRoleId())) {
                roles.set(i, role);
                return true;
            }
        }
        return false;
    }

    @Override
    public Role findById(Long roleId) {
        if (roleId == null) {
            return null;
        }
        for (Role role : roles) {
            if (role.getRoleId().equals(roleId)) {
                return role;
            }
        }
        return null;
    }

    @Override
    public boolean finByName(String name) {
        if (name == null || name.isBlank()) {
            return false;
        }
        for (Role role : roles) {
            if (name.equals(role.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Role> findAll() {
        return new ArrayList<>(roles);
    }

    @Override
    public boolean existsById(Long roleId) {
        return findById(roleId) != null;
    }

    @Override
    public boolean existsByName(String name) {
        return finByName(name);
    }
}

