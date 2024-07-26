package exceptionhandling.exceptionhandling;

import exceptionhandling.ArthimaticExample;

public class Main {
    public static void main(String[] args) {
        ArthimaticExample k = new ArthimaticExample();
        int res = 0;
        try {
            res = k.divide(5, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Please enter non zero value for second element");
        }
        System.out.println(res);
    }
}
