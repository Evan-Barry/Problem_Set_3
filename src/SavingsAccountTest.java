import javax.swing.*;

public class SavingsAccountTest {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("Evan Barry", 1, 100.00);

        System.out.println(sa.toString());

        int choice = Integer.parseInt(JOptionPane.showInputDialog("1.Lodge\n2.Withdraw" +
                                                                    "\nPlease choose an option (1 or 2): "));

        if(choice == 1)
        {
            double amount = Double.parseDouble(JOptionPane.showInputDialog("How much would like to lodge?"));

            sa.lodge(amount);
        }

        else if(choice == 2)
        {
            double amount = Double.parseDouble(JOptionPane.showInputDialog("How much would like to withdraw?"));

            sa.withdraw(amount);
        }

        System.out.println(sa.toString());

        System.out.println("Please pay €" + String.format("%.2f",sa.calcTax()) + " in tax");

    }
}
