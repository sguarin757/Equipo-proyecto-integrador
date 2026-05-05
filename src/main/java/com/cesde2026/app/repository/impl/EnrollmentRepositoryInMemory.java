package com.cesde2026.app.repository.impl;
import com.cesde2026.app.repository.EnrollmentRepository;

import models.Enrollment;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepositoryInMemory implements EnrollmentRepository {

    private List<Enrollment> enrollments;
    private Long nextEnrollmentId;

    public EnrollmentRepositoryInMemory() {
        this.enrollments = new ArrayList<>();
        this.nextEnrollmentId = 1L;
    }

    @Override
    public Enrollment createEnrollment(Enrollment enrollment) {
        if (enrollment == null) {
            return null;
        }
        enrollment.setEnrollmentId(nextEnrollmentId++);
        enrollments.add(enrollment);
        return enrollment;
    }

    @Override
    public boolean deleteEnrollment(Long enrollmentId) {
        Enrollment enrollment = findById(enrollmentId);
        if (enrollment == null) {
            return false;
        }
        return enrollments.remove(enrollment);
    }

    @Override
    public boolean updateEnrollment(Enrollment enrollment) {
        if (enrollment == null || enrollment.getEnrollmentId() == null) {
            return false;
        }
        for (int i = 0; i < enrollments.size(); i++) {
            if (enrollments.get(i).getEnrollmentId().equals(enrollment.getEnrollmentId())) {
                enrollments.set(i, enrollment);
                return true;
            }
        }
        return false;
    }

    @Override
    public Enrollment findById(Long enrollmentId) {
        if (enrollmentId == null) {
            return null;
        }
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getEnrollmentId().equals(enrollmentId)) {
                return enrollment;
            }
        }
        return null;
    }

    @Override
    public List<Enrollment> findAll() {
        return new ArrayList<>(enrollments);
    }

    @Override
    public boolean existsById(Long enrollmentId) {
        return findById(enrollmentId) != null;
    }
}

