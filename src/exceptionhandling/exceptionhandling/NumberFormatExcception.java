package exceptionhandling.exceptionhandling;

public class NumberFormatExcception {
    // checked exception it wont give any compilation error
    public int getNumber(String input) {
        return Integer.parseInt(input);
    }

//    public static void main(String[] args) {
//        NumberFormatExcception n=new NumberFormatExcception();
//        int number = n.getNumber("abcd");
//        System.out.println(number);
//    }
}
