package interfacebasics;

public class PersonMain {
//shallow copy
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("phani", 67);

        System.out.println(p1.getAge());
        System.out.println(p1.getName());

        Person p2 = (Person) p1.clone();
        System.out.println(p2.getAge());
        System.out.println(p2.getName());
    }
}
