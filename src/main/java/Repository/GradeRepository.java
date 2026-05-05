package Repository;

import models.Grade;
import java.util.List;

public interface GradeRepository {
    Grade createGrade(Grade grade);

    boolean deleteGrade(Long gradeId);

    boolean updateGrade(Grade grade);

    Grade findById(Long gradeId);

    List<Grade> findAll();

    boolean existsById(Long gradeId);
}

