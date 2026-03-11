package models;

public class enrollments {

    private Long enrollmentId;
    private Student student;
    private Groups group;
    private String status;

    public enrollments() {
    }

    public enrollments(Long enrollmentId, Student student, Groups group, String status) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.group = group;
        this.status = status;
    }

    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
