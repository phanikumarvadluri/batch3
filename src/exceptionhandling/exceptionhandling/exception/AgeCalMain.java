package exceptionhandling.exceptionhandling.exception;

public class AgeCalMain {

    public static void main(String[] args) {

        AgeCalculator ageCalculator = new AgeCalculator();
        boolean eligible = false;
        try {
            eligible = ageCalculator.isEligible(17);
        } catch (AgeNotValidException e) {
            System.out.println("your not eligible for vote");
        }

        System.out.println(eligible);
    }
}
