package service.impl;

import Repository.GroupRepository;
import service.GroupService;
import models.Group;
import java.util.List;

public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group create(Group group) {
        return groupRepository.createGroup(group);
    }

    @Override
    public boolean update(Group updateGroup) {
        return groupRepository.updateGroup(updateGroup);
    }

    @Override
    public boolean delete(Long groupId) {
        return groupRepository.deleteGroup(groupId);
    }

    @Override
    public Group findById(Long groupId) {
        return groupRepository.findById(groupId);
    }

    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }
}

