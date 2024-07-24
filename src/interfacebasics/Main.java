package interfacebasics;

public class Main {

    public static void main(String[] args) {
//        InterfaceBasic interfaceImple=new InterfaceImple();
//        interfaceImple.m1();
//        String s = interfaceImple.m2();
//        System.out.println(s);
//        interfaceImple.m4();
//        InterfaceBasic.m3();


       /* Animal d=new Dog();
        d.sound();
        d.sleep();
        Animal.eat();

        Animal c=new Cat();
        c.sound();
        c.sleep();
        Animal.eat();*/

        Hello c=new Hello();

        Dog dog=new Dog();
        Cat cat=new Cat();
        c.getSound(cat);

    }
}
