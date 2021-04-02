package Day15;

import java.util.StringTokenizer;

public class StirngDemo7 {
    public static void main(String[] args) {
        String s1 = "Hello, I ,am Milan Shahi, I am, from Nepal, i am, a java developer";
        System.out.println(s1);
        String[] ss = s1.split(",");
        System.out.println(ss.length);
        for (String s : ss) {
            System.out.println(s);
        }
        StringTokenizer st = new StringTokenizer(s1,",");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}