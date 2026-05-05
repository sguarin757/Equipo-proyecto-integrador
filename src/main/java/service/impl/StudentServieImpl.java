package service.impl;
import Repository.StudentRepository;
import service.StudentService;
import models.Student;
import java.util.List;

public class StudentServieImpl implements StudentService {

    private  final StudentRepository studentRepository;

    public StudentServieImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public boolean update(Student updatestudent) {
        return false;
    }

    @Override
    public boolean delete(Long studentId) {
        return false;
    }

    @Override
    public Student findById(Long studentId) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    private boolean isInvalidlidStudent(Student student){
        return student == null
                || !isNotblank(student.getCode())
                || !isNotblank(student.getDocumentNumber())
                || !isNotblank(student.getFirstName())

                || !isNotblank(student.getLastName())
                || student.getStatus() == null;

    }

    private boolean isNotblank(String value){
        return value != null && !value.isBlank();
    }
}
