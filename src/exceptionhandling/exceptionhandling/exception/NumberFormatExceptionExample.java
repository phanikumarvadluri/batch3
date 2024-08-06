package exceptionhandling.exceptionhandling.exception;



public class NumberFormatExceptionExample {
  // we are not throwing any  exception here
    public int getNumber(String input) {
        int output = Integer.parseInt(input);
        return output;
    }
}
