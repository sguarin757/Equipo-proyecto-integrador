package service.impl;

import Repository.SubjectRepository;
import service.SubjectService;
import models.Subject;
import java.util.List;

public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Subject create(Subject subject) {
        return subjectRepository.createSubject(subject);
    }

    @Override
    public boolean update(Subject updateSubject) {
        return subjectRepository.updateSubject(updateSubject);
    }

    @Override
    public boolean delete(Long subjectId) {
        return subjectRepository.deleteSubject(subjectId);
    }

    @Override
    public Subject findById(Long subjectId) {
        return subjectRepository.findById(subjectId);
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }
}

