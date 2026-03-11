package models;

public class Subject {
    Long subjectId;
    String name;
    String code;
    Integer credits;
    Program program;

    public Subject() {
    }

    public Subject(Long subjectId, String name, String code, Integer credits, Program program) {
        this.subjectId = subjectId;
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.program = program;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", credits=" + credits +
                ", program=" + program +
                '}';
    }
}
