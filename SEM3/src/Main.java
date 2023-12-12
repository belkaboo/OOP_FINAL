import HomeWork.Group;
import HomeWork.Stream;
import HomeWork.StreamIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab","aaa", "aaa");
        Student student2 = new Student(2, "aab","aab", "aab");
        Student student3 = new Student(1, "Aaa","Aaa", "Aaa");
        Student student4 = new Student(3, "bbb","bbb", "bbb");

        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);

        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);


    /*
        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()){
            System.out.println(iterator.next());


        for (Student student: studentGroup) {
            System.out.println(student);
        }


        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student: service.getSortedStudentGroup()) System.out.println(student);
        System.out.println();
        for (Student student: service.getSortedStudentGroupByFIO()) System.out.println(student);
    */

    // Домашнее задание

        Group group1 = new Group("Aaa");
        Group group2 = new Group("aaa");
        Group group3 = new Group("Bbb");
        Group group4 = new Group("bbb");

        Stream stream1 = new Stream(1);
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream(2);
        stream2.addGroup(group3);
        stream2.addGroup(group4);
        stream2.addGroups(group2);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);


        for (Stream stream: streams){
            System.out.println(stream);
        }





    }

}