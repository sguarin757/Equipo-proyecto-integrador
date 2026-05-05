package service.impl;

import Repository.EnrollmentRepository;
import service.EnrollmentService;
import models.Enrollment;
import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public Enrollment create(Enrollment enrollment) {
        return enrollmentRepository.createEnrollment(enrollment);
    }

    @Override
    public boolean update(Enrollment updateEnrollment) {
        return enrollmentRepository.updateEnrollment(updateEnrollment);
    }

    @Override
    public boolean delete(Long enrollmentId) {
        return enrollmentRepository.deleteEnrollment(enrollmentId);
    }

    @Override
    public Enrollment findById(Long enrollmentId) {
        return enrollmentRepository.findById(enrollmentId);
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollmentRepository.findAll();
    }
}

