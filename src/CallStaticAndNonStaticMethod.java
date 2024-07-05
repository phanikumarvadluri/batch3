public class CallStaticAndNonStaticMethod {
    public static void main(String[] args) {
        //m1();
        CallStaticAndNonStaticMethod.m1();//static method will be called using class name

        CallStaticAndNonStaticMethod object = new CallStaticAndNonStaticMethod();
        object.m2();

        CallStaticAndNonStaticMethod.m3();
        object.m4();
    }


    public static void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }

    public static void m3() {
        System.out.println("m3");
    }

    public void m4() {
        System.out.println("m4");
    }
}
