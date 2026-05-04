package Repository;

import models.Group;
import java.util.List;

public interface GroupRepository {
    Group createGroup(Group group);

    boolean deleteGroup(Long groupId);

    boolean updateGroup(Group group);

    Group findById(Long groupId);

    boolean finByCode(String code);

    List<Group> findAll();

    boolean existsById(Long groupId);

    boolean existsByCode(String code);
}

