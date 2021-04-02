package Day4;

public class ExplicitTypeCasting
{


    //explicit::double >> float >> long >> int >>short >> byte
    public static void main (String [] args){
        double d = 100.98;
        float f = (float) d;
        long l = (long) f;
        int i = (int) f;
        short s = (short) i;
        byte b = (byte) i;

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);

    }
}

