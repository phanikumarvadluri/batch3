package exceptionhandling;

public class ArthimaticExample {


    public int divide(int a, int b) throws ArithmeticException {
        int res = a / b;
        return res;
    }


    //method1   ///unchecked exception meaning we are not getting any compile time exception
   /* public int divide(int a, int b) {
        int res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Please enter non zero value for second element");
        }
        return res;
    }*/
}
