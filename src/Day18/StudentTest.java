package Day18;

import java.util.Set;
import java.util.TreeSet;

public class StudentTest {
    public static void main (String [] args){
        TreeSet<Student> students = new TreeSet<>(new Student());
        students.add(new Student("ram",45 ));
        students.add(new Student("shyam",41 ));
        students.add(new Student("hari",47 ));
        students.add(new Student("gopal",49 ));

        System.out.println(students);
       /* for (Student student : students){
            System.out.println(student);
        }*/
        System.out.println(students.last ());

    }
}
