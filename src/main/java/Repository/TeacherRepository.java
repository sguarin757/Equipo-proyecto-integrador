package Repository;
import models.Teacher;
import java.util.List;

public interface TeacherRepository {

    Teacher createTeacher(Teacher teacher);

    boolean deleteTeacher(Long teacherId);

    boolean updateTeacher(Teacher teacher);

    Teacher findById(Long teacherId);

    boolean finBydocumentNumber(String documentNumber);

    List<Teacher> findAll();

    boolean existsById(Long teacherId);

     boolean existsByDocumentNumber(String documentNumber);
}
