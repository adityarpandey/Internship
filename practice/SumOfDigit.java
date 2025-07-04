package practice;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        int len = String.valueOf(num).length();
        for (int i = 0; i < len; i++) {

            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
