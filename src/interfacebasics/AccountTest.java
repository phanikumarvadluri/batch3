package interfacebasics;

public class AccountTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        //shallow copy
        Account account=new Account();
        Address address=new Address();
        address.setCity("charlet");
        account.setName("sai");
        account.setAddress(address);
        System.out.println("original 1"+account);

        Account account2 = (Account) account.clone();
        System.out.println("copy 1"+account2);
        Address address1=new Address();
        address1.setCity("newyork");
        System.out.println("modified in copy");
        account2.setAddress(address1);
        System.out.println("Final original 1"+account);

        System.out.println("Final cloned  1"+account2);

    }
}
