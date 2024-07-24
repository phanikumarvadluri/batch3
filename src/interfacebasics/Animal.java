package interfacebasics;

public interface Animal {
    public void sound();
    public default void sleep(){
        System.out.println("Sleep");
    }
    public static void eat(){
        System.out.println("eat");
    }
}
