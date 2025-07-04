package practice;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num = scanner.nextInt();

        int len = String.valueOf(num).length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            num = num / 10;
            count++;
        }
        System.out.println("your number contains " + count + " digits of number in it");


    }
}
