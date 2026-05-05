package Repository.impl;

import Repository.GroupRepository;
import models.Group;
import java.util.ArrayList;
import java.util.List;

public class GroupRepositoryInMemory implements GroupRepository {

    private List<Group> groups;
    private Long nextGroupId;

    public GroupRepositoryInMemory() {
        this.groups = new ArrayList<>();
        this.nextGroupId = 1L;
    }

    @Override
    public Group createGroup(Group group) {
        if (group == null) {
            return null;
        }
        if (finByCode(group.getCode())) {
            return null;
        }
        group.setGroupid(nextGroupId++);
        groups.add(group);
        return group;
    }

    @Override
    public boolean deleteGroup(Long groupId) {
        Group group = findById(groupId);
        if (group == null) {
            return false;
        }
        return groups.remove(group);
    }

    @Override
    public boolean updateGroup(Group group) {
        if (group == null || group.getGroupid() == null) {
            return false;
        }
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getGroupid().equals(group.getGroupid())) {
                groups.set(i, group);
                return true;
            }
        }
        return false;
    }

    @Override
    public Group findById(Long groupId) {
        if (groupId == null) {
            return null;
        }
        for (Group group : groups) {
            if (group.getGroupid().equals(groupId)) {
                return group;
            }
        }
        return null;
    }

    @Override
    public boolean finByCode(String code) {
        if (code == null || code.isBlank()) {
            return false;
        }
        for (Group group : groups) {
            if (code.equals(group.getCode())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Group> findAll() {
        return new ArrayList<>(groups);
    }

    @Override
    public boolean existsById(Long groupId) {
        return findById(groupId) != null;
    }

    @Override
    public boolean existsByCode(String code) {
        return finByCode(code);
    }
}

