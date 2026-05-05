package service;
import models.Student;
import java.util.List;

public interface  StudentService {
        Student create(Student student);

        boolean update(Student updatestudent);

        boolean delete(Long studentId);

        Student findById(Long studentId);

        List<Student> findAll();
}
