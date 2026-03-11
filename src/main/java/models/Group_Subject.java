package models;

public class Group_Subjects {
    private Long groupSubjectId;
    private Groups group;
    private Subject subject;
    private Teacher teacher;

    public Group_Subjects() {
    }

    public Group_Subjects(Long groupSubjectId, Groups group, Subject subject, Teacher teacher) {
        this.groupSubjectId = groupSubjectId;
        this.group = group;
        this.subject = subject;
        this.teacher = teacher;
    }

    public Long getGroupSubjectId() {
        return groupSubjectId;
    }

    public void setGroupSubjectId(Long groupSubjectId) {
        this.groupSubjectId = groupSubjectId;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
