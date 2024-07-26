package interfacebasics;

public class Account implements Cloneable {
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public Account(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Account() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        Account account=(Account) super.clone();
//        account.setAddress((Address)address.clone());
//        return account;

        return super.clone();

    }


}
