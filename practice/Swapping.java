package practice;

public class Swapping {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int num = 0;

        System.out.println("before swapping a is : " + a);
        System.out.println("before swapping b is : " + b);
        System.out.println();
        System.out.println("using 3 variables");
        ThirdVariable(a, b, num);
        System.out.println();
        System.out.println("using only 2 variables");
        TwoVariable(a, b);
        System.out.println();
        System.out.println("multiplication and division");
        MulAndDivide(a, b);
        System.out.println();
        System.out.println("bitwise operator");
        Bitwise(a, b);
        System.out.println();
        System.out.println("SingleStatement");
        SingleStatement(a, b);


    }

    static void ThirdVariable(int a, int b, int num) {
        num = a;
        a = b;
        b = num;
        System.out.println("after swapping a is : " + a);
        System.out.println("after swapping b is : " + b);

    }

    static void TwoVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping a is : " + a);
        System.out.println("after swapping b is : " + b);
    }

    static void MulAndDivide(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("after swapping a is : " + a);
        System.out.println("after swapping b is : " + b);

    }

    static void Bitwise(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("after swapping a is : " + a);
        System.out.println("after swapping b is : " + b);

    }

    static void SingleStatement(int a, int b) {
        b = a + b - (a = b);
        System.out.println("after swapping a is : " + a);
        System.out.println("after swapping b is : " + b);
    }
}
