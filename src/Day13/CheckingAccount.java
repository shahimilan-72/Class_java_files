package Day13;

import jdk.swing.interop.SwingInterOpUtils;

public class CheckingAccount implements Account {

    @Override
    public void openAccount() {
        System.out.println("Checking Account is opened");
    }
}
