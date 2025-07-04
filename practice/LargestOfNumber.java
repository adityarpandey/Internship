package practice;

import java.util.Scanner;

public class LargestOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scanner.nextInt();
        System.out.println("enter second number");
        int b = scanner.nextInt();
        System.out.println("enter third number");
        int c = scanner.nextInt();

        if (a < b && c < b) {
            System.out.println(b + " b is greater");

        }
        if (b < a && c < a) {
            System.out.println(a + " a is greater");

        }
        if (a < c && b < c) {
            System.out.println(c + " c is greater");

        }
    }
}
