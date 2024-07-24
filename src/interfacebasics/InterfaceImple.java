package interfacebasics;

public class InterfaceImple implements InterfaceBasic {


    @Override
    public void m1() {

        System.out.println("m1 method");

    }

    @Override
    public String m2() {
        return "m2";
    }
}
