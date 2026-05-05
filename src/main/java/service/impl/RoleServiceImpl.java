package service.impl;

import Repository.RoleRepository;
import service.RoleService;
import models.Role;
import java.util.List;

public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role create(Role role) {
        return roleRepository.createRole(role);
    }

    @Override
    public boolean update(Role updateRole) {
        return roleRepository.updateRole(updateRole);
    }

    @Override
    public boolean delete(Long roleId) {
        return roleRepository.deleteRole(roleId);
    }

    @Override
    public Role findById(Long roleId) {
        return roleRepository.findById(roleId);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}

