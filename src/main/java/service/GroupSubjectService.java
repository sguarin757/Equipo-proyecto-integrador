package service;

import models.Group_Subject;
import java.util.List;

public interface GroupSubjectService {
    Group_Subject create(Group_Subject groupSubject);

    boolean update(Group_Subject updateGroupSubject);

    boolean delete(Long groupSubjectId);

    Group_Subject findById(Long groupSubjectId);

    List<Group_Subject> findAll();
}

