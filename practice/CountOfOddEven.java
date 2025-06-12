package practice;

import java.util.Scanner;

public class CountOfOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int countEven = 0;
        int countOdd = 0;
        int check;

        int len = String.valueOf(num).length();
        for (int i = 0; i < len; i++) {
            check = num % 2;
            if (check == 0) {
                countEven++;
            } else {
                countOdd++;

            }
            num = num / 10;

        }
        System.out.println("the count of even number are : " + countEven);
        System.out.println("the count of odd number are : " + countOdd);
    }
}
