package interfacebasics;

public class Address  {

    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public Address(String city) {
        this.city = city;
    }

    public Address() {
    }

    public void setCity(String city) {
        this.city = city;
    }


}
