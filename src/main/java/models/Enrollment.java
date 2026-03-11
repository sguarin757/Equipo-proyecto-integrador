package models;

public class Enrollment {

    private Long enrollmentId;
    private Student student;
    private Program program;
    private Period period;
    private Group group;
    private boolean status;

    public Enrollment() {
    }

    public Enrollment(Long enrollmentId, Student student, Program program, Period period, Group group, boolean status) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.program = program;
        this.period = period;
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

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", student=" + student +
                ", program=" + program +
                ", period=" + period +
                ", group=" + group +
                ", status=" + status +
                '}';
    }
}
