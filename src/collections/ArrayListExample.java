package collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(40);
        listInt.add(50);
        listInt.add(60);
        // add a element
        listInt.add(90);
        listInt.add(90);

        listInt.add(2, 1000);
        System.out.println("Before remove" + listInt);
        listInt.remove(2);
        System.out.println("After remove" + listInt);


    }
}
