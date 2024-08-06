package collections;

public class Main {
    public static void main(String[] args) {


        ArrayExample arrayExample = new ArrayExample();

//        int[] ar = new int[4];
//        ar[0] = 10;
//        ar[1] = 20;
//        ar[2] = 30;
//        ar[3] = 40;
        int[] ar={10,20,30,40};
        int firstNumber = arrayExample.getFirstNumber(ar);
        System.out.println(firstNumber);
    }
}
