package com.cesde2026.app.repository;

import Repository.TeacherRepository;
import models.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryInMemory implements TeacherRepository {

    private List<Teacher> teachers;
    private Long nextTeacherId;

    public TeacherRepositoryInMemory() {
        this.teachers = new ArrayList<>();
        this.nextTeacherId = 1L;
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        if (teacher == null) return null;


        if (existsByDocumentNumber(teacher.getDocumentNumber())) {
            return null;
        }

        teacher.setTeacherId(nextTeacherId++);
        teachers.add(teacher);
        return teacher;
    }

    @Override
    public boolean deleteTeacher(Long teacherId) {
        Teacher teacher = findById(teacherId);
        if (teacher == null) return false;
        return teachers.remove(teacher);
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        if (teacher == null || teacher.getTeacherId() == null) return false;

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getTeacherId().equals(teacher.getTeacherId())) {
                teachers.set(i, teacher);
                return true;
            }
        }
        return false;
    }

    @Override
    public Teacher findById(Long teacherId) {
        if (teacherId == null) return null;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public List<Teacher> findAll() {
        return new ArrayList<>(teachers);
    }

    @Override
    public boolean existsById(Long teacherId) {
        return findById(teacherId) != null;
    }

    public boolean existsByDocumentNumber(String documentNumber) {
        if (documentNumber == null) return false;
        return teachers.stream()
                .anyMatch(t -> documentNumber.equals(t.getDocumentNumber()));
    }
}