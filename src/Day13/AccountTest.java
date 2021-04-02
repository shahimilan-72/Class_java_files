package Day13;
import java.util.Scanner;

public class AccountTest{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String Choice = input.nextLine();
        System.out.println("Enter the type of account: ");
        Account account = null;

        switch (Choice){
            case "saving":
                account = new SavingAccount();
                break;
            case "checking":
                account = new CheckingAccount();
                break;
            case "current":
                account = new CurrentAccount();
                break;
            default:
                System.out.println("Wrong choice entered!!!!!");
        }

        if(account!=null){
            account.openAccount();
        }
    }

}
