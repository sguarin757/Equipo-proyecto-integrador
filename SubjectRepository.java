package Repository;

import models.Subject;
import java.util.List;

public interface SubjectRepository {
    Subject createSubject(Subject subject);

    boolean deleteSubject(Long subjectId);

    boolean updateSubject(Subject subject);

    Subject findById(Long subjectId);

    boolean finByCode(String code);

    List<Subject> findAll();

    boolean existsById(Long subjectId);

    boolean existsByCode(String code);
}

