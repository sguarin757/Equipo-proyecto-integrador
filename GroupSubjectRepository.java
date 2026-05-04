package Repository;

import models.Group_Subject;
import java.util.List;

public interface GroupSubjectRepository {
    Group_Subject createGroupSubject(Group_Subject groupSubject);

    boolean deleteGroupSubject(Long groupSubjectId);

    boolean updateGroupSubject(Group_Subject groupSubject);

    Group_Subject findById(Long groupSubjectId);

    List<Group_Subject> findAll();

    boolean existsById(Long groupSubjectId);
}

