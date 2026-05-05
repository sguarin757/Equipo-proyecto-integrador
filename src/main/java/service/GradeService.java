package service;

import models.Grade;
import java.util.List;

public interface GradeService {
    Grade create(Grade grade);

    boolean update(Grade updateGrade);

    boolean delete(Long gradeId);

    Grade findById(Long gradeId);

    List<Grade> findAll();
}

