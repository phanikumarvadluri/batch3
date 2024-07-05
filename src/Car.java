public class Car {


    public static void speed()
    {
        System.out.println("speed is 90 miles");
    }

    public  void speedCheck()
    {
        System.out.println("speed is 90 miles from other method");
    }

    public static int speedMilesReturn()
    {
        int miles=90;
        return miles;
    }

    public  int speedMilesReturnNonStaic()
    {
        int miles=90;
        return miles;
    }
}
