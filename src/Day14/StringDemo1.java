package Day14;

public class StringDemo1 {

    public static void main (String [] args){
        //implicit creation by literal way
        String s1 = "Nepal";
        System.out.println(s1);

        //explicit creation
        String s2 = new String();
        System.out.println(s2);


        String s3 = new String("Nepal");
        System.out.println(s3);

        char [] ch ={'a','b','c'};
        String s4 = new String (ch);
        System.out.println(s4);

        byte [] bb = {65,66,67};
        String s5 = new String(bb);
        System.out.println(s5);


    }
}
// for every new term it creates object in heap area
// string defined in a straight way is saved in literal pool.
// same string is always pointed to literal area pool.