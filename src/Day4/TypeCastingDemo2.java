package Day4;

public class TypeCastingDemo2 {

    public static void main (String [] args) {

        char c1 = 65;
        byte b1 = 65;
        System.out.println(c1);
        System.out.println(b1);


        char c2 = 'a';
        byte b2 = 'a';
        System.out.println(c2);
        System.out.println(b2);

        char c3 = 77;
        byte b3 =  (byte) c3;

        byte b4 =88;
        char c4 = (char)b4;

    }

}
//between char and byte sometimes implicit type casting occurs
//sometimes it need to be casted using explicit conversion