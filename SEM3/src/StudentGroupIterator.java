import java.util.List;

public class StudentGroupIterator {
    private List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
    }
}
