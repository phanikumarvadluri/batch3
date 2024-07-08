package constuctorbasics;

public class PersonMain {

    public static void main(String[] args) {
        Person person=new Person("Raju",30,"raju.lov@gmaik.com");
        Person person1=new Person("vineth",30,"veneeth.lov@gmaik.com");
        person.display();
        person1.display();
    }
}
