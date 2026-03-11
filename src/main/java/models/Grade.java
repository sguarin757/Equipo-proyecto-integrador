package models;

public class Grade {
    private Long gradeId;
    private Group_Subject groupSubject;
    private Student student;
    private Double finalScore;
    private String observation;

    public Grade() {
    }

    public Grade(Long gradeId, Group_Subject groupSubject, Student student, Double finalScore, String observation) {
        this.gradeId = gradeId;
        this.groupSubject = groupSubject;
        this.student = student;
        this.finalScore = finalScore;
        this.observation = observation;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Group_Subject getGroupSubject() {
        return groupSubject;
    }

    public void setGroupSubject(Group_Subject groupSubject) {
        this.groupSubject = groupSubject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", groupSubject=" + groupSubject +
                ", student=" + student +
                ", finalScore=" + finalScore +
                ", observation='" + observation + '\'' +
                '}';
    }
}
