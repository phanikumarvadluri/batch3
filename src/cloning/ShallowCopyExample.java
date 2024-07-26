package cloning;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Item> originalList=new ArrayList<>();
        originalList.add(new Item("Item1"));
        originalList.add(new Item("Item2"));


       // List<Item> cloneList=new ArrayList<>(originalList);

        List<Item> cloneList=new ArrayList<>();
        for(Item item:originalList)
        {
            cloneList.add((Item)item.clone());

        }

        System.out.println("Original List"+originalList);
        System.out.println("CLone list"+cloneList);

        originalList.get(0).name="ChangedItem1";

        System.out.println("Original List"+originalList);
        System.out.println("CLone list"+cloneList);

    }
}
