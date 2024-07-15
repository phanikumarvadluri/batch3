package blocks;

public class TestMain {

    public static void main(String[] args) {

        Test test = new Test(1,2,3);

        int a = test.getA();
        int b = test.getB();
        int c = test.getC();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
