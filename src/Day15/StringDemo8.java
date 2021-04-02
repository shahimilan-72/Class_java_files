package Day15;

public class StringDemo8 {
    public static void main (String [] args) {

        System.out.println(isYes("yes"));
        System.out.println(isYes("Yes"));
        System.out.println(isNumber("123"));
    }
    public static boolean isYes(String s) {
        return s.matches("[y|Y]es|[N|n]o");

    }
    public static boolean isNumber(String s){
        return s.matches ("\\d+");
    }
}
