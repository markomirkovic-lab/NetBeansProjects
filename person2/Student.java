package person2;

/**
 *
 * @author Neil Otupacca
 * @version 16 September 2022
 */
public class Student extends Person {

    private String studentId;

    public Student(String firstName, String lastName,
                   int birthDay, int birthMonth, int birthYear,
                   String studentId) {
        super(firstName, lastName, birthDay, birthMonth, birthYear);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", " + studentId;
    }
}
