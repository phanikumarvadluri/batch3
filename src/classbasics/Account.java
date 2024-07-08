package classbasics;

public class Account {
    int accountNumber;
    String accountHolderName;
    double balance;


    Account()
    {
        System.out.println("this is constuctor and it is default");
    }

    Account(int accountNumber,String accountHolderName,double balanceabcd)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        balance=balanceabcd;
    }

    public void display()
    {
        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(balance);
    }

}
