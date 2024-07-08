package constuctorbasics;

public class Person {
    String name;
    int age;
    String email;

    //constuctor
    //same name as that of the class
    Person() {
        System.out.println("This is a constuctor and it is default");
    }

//    Person(String nameVariable, int ageVaribale, String emailVarible) {
//        name = nameVariable;
//        age = ageVaribale;
//        email = emailVarible;
//    }

        Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }
}
