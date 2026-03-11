package String;

import java.util.Objects;

public class Student implements Comparable<Student> {

    int id;
    String name;
    int age;


    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "id: " + id + ", name: " + name + ", age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
