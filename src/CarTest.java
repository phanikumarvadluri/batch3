public class CarTest {
    public static void main(String[] args) {

        Car.speed();

        Car c1=new Car();

        c1.speedCheck();

        int miles=Car.speedMilesReturn();
        System.out.println(miles);

        int milesNonstatic=c1.speedMilesReturnNonStaic();
        System.out.println(milesNonstatic);



    }
}
