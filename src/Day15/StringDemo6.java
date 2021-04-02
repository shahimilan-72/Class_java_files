package Day15;

import java.util.StringTokenizer;

public class StringDemo6 {
    public static void main (String [] args ){
        String s1 ="Hello, I am Milan Shahi, I am from Nepal, i am a java developer";
        System.out.println(s1);
        StringTokenizer st = new StringTokenizer(s1);
       while (st.hasMoreTokens()){
           System.out.println(st.nextToken());
        }
    }

}
