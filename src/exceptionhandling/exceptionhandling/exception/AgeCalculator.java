package exceptionhandling.exceptionhandling.exception;

public class AgeCalculator {

    public boolean isEligible(int age) throws AgeNotValidException {
        if (age >= 18) {
            return true;
        } else {
            throw new AgeNotValidException("Not Eligible");
        }
    }
}

