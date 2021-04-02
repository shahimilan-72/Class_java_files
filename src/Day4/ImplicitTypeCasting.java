package Day4;

public class ImplicitTypeCasting {

    //implicit
    //byte >> short >> int >> long >> float >> double
    public static void main (String [] args){
        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = l;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

    }
}
