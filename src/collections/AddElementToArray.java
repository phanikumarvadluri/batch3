package collections;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {
        // Created a array with size 3
        int[] myArray = {1, 2, 3};

        // now i want element need to create new ARRAY
        int[] newArray = new int[myArray.length + 9];


        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        //Add the element

        newArray[newArray.length - 1] = 4;
        newArray[newArray.length - 2] = 5;
        newArray[newArray.length - 3] = 7;
        newArray[newArray.length - 4] = 7;
        newArray[newArray.length - 5] = 7;
        newArray[newArray.length - 6] = 7;
        newArray[newArray.length - 7] = 7;
        newArray[newArray.length - 8] = 7;

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(newArray));
    }
}
