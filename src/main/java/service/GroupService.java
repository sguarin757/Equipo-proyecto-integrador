package service;

import models.Group;
import java.util.List;

public interface GroupService {
    Group create(Group group);

    boolean update(Group updateGroup);

    boolean delete(Long groupId);

    Group findById(Long groupId);

    List<Group> findAll();
}

