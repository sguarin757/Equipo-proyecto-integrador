package Repository.impl;

import Repository.SubjectRepository;
import models.Subject;
import java.util.ArrayList;
import java.util.List;

public class SubjectRepositoryInMemory implements SubjectRepository {

    private List<Subject> subjects;
    private Long nextSubjectId;

    public SubjectRepositoryInMemory() {
        this.subjects = new ArrayList<>();
        this.nextSubjectId = 1L;
    }

    @Override
    public Subject createSubject(Subject subject) {
        if (subject == null) {
            return null;
        }
        if (finByCode(subject.getCode())) {
            return null;
        }
        subject.setSubjectId(nextSubjectId++);
        subjects.add(subject);
        return subject;
    }

    @Override
    public boolean deleteSubject(Long subjectId) {
        Subject subject = findById(subjectId);
        if (subject == null) {
            return false;
        }
        return subjects.remove(subject);
    }

    @Override
    public boolean updateSubject(Subject subject) {
        if (subject == null || subject.getSubjectId() == null) {
            return false;
        }
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getSubjectId().equals(subject.getSubjectId())) {
                subjects.set(i, subject);
                return true;
            }
        }
        return false;
    }

    @Override
    public Subject findById(Long subjectId) {
        if (subjectId == null) {
            return null;
        }
        for (Subject subject : subjects) {
            if (subject.getSubjectId().equals(subjectId)) {
                return subject;
            }
        }
        return null;
    }

    @Override
    public boolean finByCode(String code) {
        if (code == null || code.isBlank()) {
            return false;
        }
        for (Subject subject : subjects) {
            if (code.equals(subject.getCode())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Subject> findAll() {
        return new ArrayList<>(subjects);
    }

    @Override
    public boolean existsById(Long subjectId) {
        return findById(subjectId) != null;
    }

    @Override
    public boolean existsByCode(String code) {
        return finByCode(code);
    }
}

