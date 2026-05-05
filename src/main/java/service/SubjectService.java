package service;

import models.Subject;
import java.util.List;

public interface SubjectService {
    Subject create(Subject subject);

    boolean update(Subject updateSubject);

    boolean delete(Long subjectId);

    Subject findById(Long subjectId);

    List<Subject> findAll();
}

