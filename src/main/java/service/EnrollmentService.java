package service;

import models.Enrollment;
import java.util.List;

public interface EnrollmentService {
    Enrollment create(Enrollment enrollment);

    boolean update(Enrollment updateEnrollment);

    boolean delete(Long enrollmentId);

    Enrollment findById(Long enrollmentId);

    List<Enrollment> findAll();
}

