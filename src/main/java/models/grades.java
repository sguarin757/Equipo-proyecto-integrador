package models;

public class grades {
    private Long gradeId;
    private Enrollment enrollment;
    private Subject subject;
    private Double gradeValue;

    public grades() {
    }

    public grades(Long gradeId, Enrollment enrollment, Subject subject, Double gradeValue) {
        this.gradeId = gradeId;
        this.enrollment = enrollment;
        this.subject = subject;
        this.gradeValue = gradeValue;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Double getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(Double gradeValue) {
        this.gradeValue = gradeValue;
    }
}
