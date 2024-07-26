package exceptionhandling.exceptionhandling;

public class AgeCalculator {

    public boolean eligible(int age) throws AgeInvlidException {
        if (age > 18) {
            System.out.println("Eligible for vote");
            return true;
        } else {
            throw new AgeInvlidException("Not Eligible for vote");
        }
    }
}
