package exceptionhandling.exceptionhandling.exception;

import exceptionhandling.exceptionhandling.NumberFormatExcception;

public class NumberFormatExampleMain {

    public static void main(String[] args) {

  // Unchecked exception  // runtime exception
        NumberFormatExceptionExample ex=new NumberFormatExceptionExample();
        int number=0;
        try {
           number = ex.getNumber("Phani");
        }
        catch(NumberFormatException exception)
        {
            System.out.println("looks like entered string format, Please enter number formatString " + exception.getMessage());
        }

        finally{
            System.out.println("Phani");
            System.out.println("Phani");
            System.out.println("Phani");
            System.out.println("Phani");
        }

        System.out.println(number);
    }
}
