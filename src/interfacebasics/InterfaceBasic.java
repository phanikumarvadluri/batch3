package interfacebasics;

public interface InterfaceBasic {
    //rule 1- no body for non static method
    public void m1();

    public String m2();
    //rule 2- provide body for non static method
    public static void m3() {
        System.out.println("m3 static");
    }
    //rule 3
    public default void m4(){
        System.out.println("m4 default method");
    }

}
