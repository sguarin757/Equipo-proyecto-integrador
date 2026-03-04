package models;

public class group_subjects {
    private Long groupSubjectId;
    private Groups group;
    private Subjects subject;
    private Teacher teacher;

    public group_subjects() {
    }

    public group_subjects(Long groupSubjectId, Groups group, Subjects subject, Teacher teacher) {
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

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
