package Exercise2;

import javax.swing.*;


public class AccountDriver {
    public static void main(String[] args) {

        //Initializing default constructor
        BankAccount account=new BankAccount();

        //Initializing constructor with multiple arguments
        BankAccount account1 = new BankAccount("21345712","Samson Due",60000.00);

        JOptionPane.showMessageDialog(null,"****** Welcome to Centennial Bank ******");
        //Displaying default account
        JOptionPane.showMessageDialog(null,"This is default existing account");
        account1.getAccountInfo();

        //Taking input from user
        String accountNumber= JOptionPane.showInputDialog("Enter Account Number ");
        account.setAccountNumber(accountNumber);
        String name= JOptionPane.showInputDialog("Enter Name");
        account.setOwnerName(name);
        Double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance Amount (Enter amount in decimal as example 6000.00)"));
        account.setBalance(balance);

        //Displaying information
        account.getAccountInfo();

        //Confirming if user wants to deposit amount
       int optionDeposit =  JOptionPane.showConfirmDialog(null,"Do you want to Deposit Amount");
       if(optionDeposit==0)
       {
           Double depositAmount= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount to be deposited (Enter amount in decimal as example 6000.00)"));
           account.Deposit(depositAmount);
           account.getAccountInfo();

       }

       //Confirming if user wants to withdraw amount
       int optionWithdraw= JOptionPane.showConfirmDialog(null,"Do you want to Withdraw Amount ");
       if(optionWithdraw==0)
       {
           Double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter amount to be withdrawn (Enter amount in decimal as exapmle 6000.00)"));
           account.Withdraw(withdrawAmount);
           account.getAccountInfo();

       }

       JOptionPane.showMessageDialog(null,"****** Thank You for Banking with us ******");


    }
}
