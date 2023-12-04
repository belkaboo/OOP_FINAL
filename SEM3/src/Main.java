import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "aaa","aaa", "aaa");
        Student student2 = new Student(2, "aab","aab", "aab");
        Student student3 = new Student(3, "Aaa","Aaa", "Aaa");
        Student student4 = new Student(4, "bbb","bbb", "bbb");

        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}