package Day4;

public class TypeCastingDemo1 {
    public static void main (String [] args)
    {
        byte b1 = 127;
        int i1 = 127;//implicit type casting
        System.out.println(b1);
        System.out.println(i1);

        int x = 127;
        byte y = (byte) x;//explicit casting
        System.out.println(x);
        System.out.println(y);

        //implicit::byte >> short >> int >>  long >> float >> double
        //explicit::double >> float >> long >> int >>short >> byte

        int a = 200;
        byte b = (byte)200;
        System.out.println(a);
        System.out.println(b);
    }
}
