package service;

import models.Teacher;
import java.util.List;

public interface TeacherService {
    Teacher create(Teacher teacher);

    boolean update(Teacher updateTeacher);

    boolean delete(Long teacherId);

    Teacher findById(Long teacherId);

    List<Teacher> findAll();
}

