package practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("enter how much series you want : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int series = 0;
        System.out.println("the Fibonacci series is : ");
        for (int i = 1; i < num + 1; i++) {
            series = series + i;

            System.out.println(" " + series);
        }

    }
}
