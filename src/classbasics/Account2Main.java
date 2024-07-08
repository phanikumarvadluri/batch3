package classbasics;

public class Account2Main {

    public static void main(String[] args) {


        Account2 accountVar=new Account2();

        accountVar.setAccountNumber(9000);
        accountVar.setAccountHolderName("Phani");
        accountVar.setBalance(98888.8);

        int accountNumber = accountVar.getAccountNumber();
        String accountHolderName = accountVar.getAccountHolderName();
        double balance = accountVar.getBalance();

        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(balance);



        //============================================

        Account2 accountVar2=new Account2();
        accountVar2.setAccountNumber(9001);
        accountVar2.setAccountHolderName("Chandini");
        accountVar2.setBalance(988.8);

        int accountNumberC = accountVar2.getAccountNumber();
        String accountHolderNameC = accountVar2.getAccountHolderName();
        double balanceC = accountVar2.getBalance();

        System.out.println(accountNumberC);
        System.out.println(accountHolderNameC);
        System.out.println(balanceC);



    }
}
