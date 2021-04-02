package Day16;

public class ExceptionDemo8 {
        public static void main (String [] args){
            vote(20);
            System.out.println("Exit");
        }
        public static void vote (int age){
            if(age > 18){
                System.out.println("you can vote...");
            }
            else{
                throw new ArithmeticException("You cannot vote..");
            }
        }

}
