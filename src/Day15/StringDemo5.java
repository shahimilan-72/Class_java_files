package Day15;

public class StringDemo5 {

    public static void main (String [] args ){
        String s1 ="Hello, I am Milan Shahi, I am from Nepal, i am a java developer";
        System.out.println(s1);
      String [] ss = s1.split(",");
        for (String s: ss) {
            System.out.println(s);
        }
    }
}
