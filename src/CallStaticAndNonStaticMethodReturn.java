public class CallStaticAndNonStaticMethodReturn {

    public static void main(String[] args) {

        CallStaticAndNonStaticMethodReturn obj = new CallStaticAndNonStaticMethodReturn();
        String s = obj.m1();
        System.out.println(s);

        String res = CallStaticAndNonStaticMethodReturn.m2();
        System.out.println(res);


    }


    public String m1() {
        String s = "message";
        return s;
    }

    public static String m2() {
        String s = "other message";
        return s;
    }


}
