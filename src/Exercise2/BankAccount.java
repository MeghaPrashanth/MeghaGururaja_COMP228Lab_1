package Exercise2;

import javax.swing.*;

public class BankAccount {


    String accountNumber;
    String ownerName;
    Double balance;

    public  BankAccount()
    {
        accountNumber=null;
        ownerName=null;
        balance=0.0;
    }
    public BankAccount (String accountNumber,String ownerName,Double balance)
    {
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        if(balance>0.0)
        {
            this.balance=balance;
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        if(balance>0.0)
            this.balance=balance;
    }

    public void Deposit(double depositAmount)
    {
        if(depositAmount>0.0)
        {
            balance += depositAmount;
        }
    }

    public  void  Withdraw(double withdrawAmount)
    {
        if(balance>0.0)
        {
            balance = balance - withdrawAmount;
        }
    }

    public void getAccountInfo()
    {
        String message = "<html> Hi " + getOwnerName() + "<br>"
                +"Your Account Number is :" + getAccountNumber()
                + "<br>" +
                "Your Account Balance is : $" + getBalance();
        JOptionPane.showMessageDialog(null,message);
    }
}
