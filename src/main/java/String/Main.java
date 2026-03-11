package String;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student s3 = new Student(3, "Jane", 25);
        Student s1 = new Student(1, "John", 27);
        Student s2 = new Student(2, "DOE", 26);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

    }
}
