package service.impl;

import Repository.GradeRepository;
import service.GradeService;
import models.Grade;
import java.util.List;

public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;

    public GradeServiceImpl(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    @Override
    public Grade create(Grade grade) {
        return gradeRepository.createGrade(grade);
    }

    @Override
    public boolean update(Grade updateGrade) {
        return gradeRepository.updateGrade(updateGrade);
    }

    @Override
    public boolean delete(Long gradeId) {
        return gradeRepository.deleteGrade(gradeId);
    }

    @Override
    public Grade findById(Long gradeId) {
        return gradeRepository.findById(gradeId);
    }

    @Override
    public List<Grade> findAll() {
        return gradeRepository.findAll();
    }
}

