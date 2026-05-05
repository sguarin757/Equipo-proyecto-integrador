package service.impl;

import Repository.TeacherRepository;
import service.TeacherService;
import models.Teacher;
import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacherRepository.createTeacher(teacher);
    }

    @Override
    public boolean update(Teacher updateTeacher) {
        return teacherRepository.updateTeacher(updateTeacher);
    }

    @Override
    public boolean delete(Long teacherId) {
        return teacherRepository.deleteTeacher(teacherId);
    }

    @Override
    public Teacher findById(Long teacherId) {
        return teacherRepository.findById(teacherId);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }
}

