package Exercise2;

import javax.swing.*;

public class AccountDriver {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        String accountNumber= JOptionPane.showInputDialog("Enter Account Number ");
        account.setAccountNumber(accountNumber);
        String name= JOptionPane.showInputDialog("Enter Name");
        account.setOwnerName(name);
        Double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance Amount"));
        account.setBalance(balance);

    }
}
