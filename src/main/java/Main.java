import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Andrey", 18, 2023);
//        Student student2 = new Student("Ivan", 19, 2023);
//        Student student3 = new Student("Sergey", 20, 2023);
//        Student student4 = new Student("Denis", 17, 2023);
//
//        List students1 = new ArrayList<>();
//        StudyGroup group1 = new StudyGroup(students1,"group1");
//        group1.addStudents(student1);
//        group1.addStudents(student2);
//        group1.addStudents(student3);
//        group1.addStudents(student4);
//
//        Student student5 = new Student("Igor", 18, 2023);
//        Student student6 = new Student("Petr", 19, 2023);
//        Student student7 = new Student("Oleg", 20, 2023);
//        Student student8 = new Student("Jac", 17, 2023);
//
//        List students2 = new ArrayList<>();
//        StudyGroup group2 = new StudyGroup(students2,"group2");
//        group2.addStudents(student5);
//        group2.addStudents(student6);
//        group2.addStudents(student7);
//        group2.addStudents(student8);
//
//        System.out.println(group2);

        StudyGroup group1 = new StudyGroup("group1");
        StudyGroup group2 = new StudyGroup("group2");
        StudyGroup group3 = new StudyGroup("group3");
        StudyGroup group4 = new StudyGroup("group4");
        StudyGroup group5 = new StudyGroup("group5");
        StudyGroup group6 = new StudyGroup("group6");
        StudyGroup group7 = new StudyGroup("group7");
        StudyGroup group8 = new StudyGroup("group8");
        StudyGroup group9 = new StudyGroup("group9");

        Stream stream1 = new Stream("stream1");
        Stream stream2 = new Stream("stream2");
        Stream stream3 = new Stream("stream3");
        Stream stream4 = new Stream("stream4");

        stream1.addGroup(group1);
        stream1.addGroup(group2);

        stream2.addGroup(group3);

        stream3.addGroup(group4);
        stream3.addGroup(group5);
        stream3.addGroup(group6);
        stream3.addGroup(group7);
        stream3.addGroup(group8);

        stream4.addGroup(group9);

        StreamService list = new StreamService();
        list.addStream(stream1);
        list.addStream(stream2);
        list.addStream(stream3);
        list.addStream(stream4);

        list.SortStream();

        System.out.println(list.getStream());


    }

}
