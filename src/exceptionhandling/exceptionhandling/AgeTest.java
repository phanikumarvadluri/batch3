package exceptionhandling.exceptionhandling;

public class AgeTest {

    public static void main(String[] args) {


        AgeCalculator ageCalculator=new AgeCalculator();
        try {
            ageCalculator.eligible(17);
        } catch (AgeInvlidException e) {
           System.out.println("age is not valoid");
        }

    }
}
