package practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your number : ");
        int num = scanner.nextInt();
        int reverse;
        int length = String.valueOf(num).length();
        System.out.println("usingBuffer");
        usingBuffer(num);
        System.out.println("using algorithm");
        for (int i = 0; i < length; i++) {

            reverse = num % 10;
            System.out.print(reverse);
            num = num / 10;

        }
        System.out.println();


    }

    static void usingBuffer(int num) {
        StringBuffer rev = new StringBuffer(String.valueOf(num));
        System.out.println(rev.reverse());

    }
}
