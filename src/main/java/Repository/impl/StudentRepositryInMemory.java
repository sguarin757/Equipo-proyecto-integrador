package Repository.impl;
import Repository.StudentRepository;
import models.Student;
import java.util.List;
import java.util.ArrayList;

public class StudentRepositryInMemory implements StudentRepository {

    private List<Student> students;
    private Long nextStudentId;

    public StudentRepositryInMemory() {
        this.students = new java.util.ArrayList<>();
        this.nextStudentId = 1L;
    }

    @Override
    public Student createStudent(Student student) {
        if (student == null) {
            return null;
        }
        if(finBydocumentNumber(student.getDocumentNumber())){
            return null;
        }
        student.setStudentId(nextStudentId++);
        students.add(student);
        return student;
    }

    @Override
    public boolean deleteStudent(Long studentId) {
        if (studentId == null) {
            return false;
        }
        Student student = findById(studentId);
        if (student == null) {
            return false;
        }
        return students.remove(student);
    }

    @Override
    public boolean updateStudent(Student student) {
        if (student == null || student.getStudentId() == null) {
            return false;
        }
        for (Student student1: students) {
            if (!student1.getStudentId().equals(student1.getStudentId())
                    && student1.getDocumentNumber().equals(student1.getDocumentNumber())) {
                return false;
            }
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(student.getStudentId())) {
                students.set(i, student);
                return true;
            }
        }
        return false;
    }

    @Override
    public Student findById(Long studentId) {
        if (studentId == null) {
            return null;
        }
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean finBydocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return false;
        }
        for (Student student : students) {
            if (student.getDocumentNumber().equals(documentNumber)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public boolean existsById(Long studentId) {
        if (studentId == null) {
            return false;
        }
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return false;
        }
        for (Student student : students) {
            if (student.getDocumentNumber().equals(documentNumber)) {
                return true;
            }
        }
        return false;
    }
}
