package Repository;

import models.Enrollment;
import java.util.List;

public interface EnrollmentRepository {
    Enrollment createEnrollment(Enrollment enrollment);

    boolean deleteEnrollment(Long enrollmentId);

    boolean updateEnrollment(Enrollment enrollment);

    Enrollment findById(Long enrollmentId);

    List<Enrollment> findAll();

    boolean existsById(Long enrollmentId);
}

