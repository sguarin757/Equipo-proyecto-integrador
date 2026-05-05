package Repository.impl;

import Repository.GradeRepository;
import models.Grade;
import java.util.ArrayList;
import java.util.List;

public class GradeRepositoryInMemory implements GradeRepository {

    private List<Grade> grades;
    private Long nextGradeId;

    public GradeRepositoryInMemory() {
        this.grades = new ArrayList<>();
        this.nextGradeId = 1L;
    }

    @Override
    public Grade createGrade(Grade grade) {
        if (grade == null) {
            return null;
        }
        grade.setGradeId(nextGradeId++);
        grades.add(grade);
        return grade;
    }

    @Override
    public boolean deleteGrade(Long gradeId) {
        Grade grade = findById(gradeId);
        if (grade == null) {
            return false;
        }
        return grades.remove(grade);
    }

    @Override
    public boolean updateGrade(Grade grade) {
        if (grade == null || grade.getGradeId() == null) {
            return false;
        }
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getGradeId().equals(grade.getGradeId())) {
                grades.set(i, grade);
                return true;
            }
        }
        return false;
    }

    @Override
    public Grade findById(Long gradeId) {
        if (gradeId == null) {
            return null;
        }
        for (Grade grade : grades) {
            if (grade.getGradeId().equals(gradeId)) {
                return grade;
            }
        }
        return null;
    }

    @Override
    public List<Grade> findAll() {
        return new ArrayList<>(grades);
    }

    @Override
    public boolean existsById(Long gradeId) {
        return findById(gradeId) != null;
    }
}

