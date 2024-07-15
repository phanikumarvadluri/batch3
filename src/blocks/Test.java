package blocks;

public class Test {
    private int a;//this variable are non static
    private int b;
    private int c;

    Test()
    {
    }
    Test(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
