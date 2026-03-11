package models;

public class Teacher extends Person {
    private Long teacherId;

    public Teacher() {
    }

    public Teacher(Long teacherId, Long userId, String code, String documentNumber, String firstName, String lastName, Boolean status) {
        super(userId, code, documentNumber, firstName, lastName, status);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "userId=" + getUserId() +
                ", code='" + getCode() + '\'' +
                ", documentNumber='" + getDocumentNumber() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", status=" + getStatus() +
                ", teacherId=" + teacherId +
                '}';
    }
}

