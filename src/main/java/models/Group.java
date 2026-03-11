package models;

public class Group {
    private Long groupid;
    private String code;
    private Program program;
    private Period period;
    private String shift;

    public Group() {
    }

    public Group(Long groupid, String code, Program program, Period period, String shift) {
        this.groupid = groupid;
        this.code = code;
        this.program = program;
        this.period = period;
        this.shift = shift;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupid=" + groupid +
                ", code='" + code + '\'' +
                ", program=" + program +
                ", period=" + period +
                ", shift='" + shift + '\'' +
                '}';
    }
}
