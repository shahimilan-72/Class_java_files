package Day15;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Good");
        System.out.println(sb);
        sb.append ("Morning");
        System.out.println(sb);
        sb.insert(0, "hello");
        System.out.println(sb);
        sb.delete(7,12);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }

}
//Java provides three classes to represent a sequence of
// characters: String, StringBuffer, and StringBuilder.
// The String class is an immutable class whereas StringBuffer
// and StringBuilder classes are mutable.
// There are many differences between StringBuffer and StringBuilder.
// The StringBuilder class is introduced since JDK 1.5.
//for multithreaded program --> Stringbuffer (expensive synchronized method)
//for non-multithreaded program --> Stringbuilder