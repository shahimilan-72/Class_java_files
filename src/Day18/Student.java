package Day18;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Comparator<Student> {

    private String name;
    private int age;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }else {
            return -1;

        }

    }@Override
    public String toString(){
        return getName() + "  "+getAge();
    }

}

