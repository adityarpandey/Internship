package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rev = 0;
        int len = String.valueOf(num).length();
        int check = num;
        for (int i = 0; i < len; i++) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.print("your reverse is : " + rev + " and it is : ");
        if (check == rev) {
            System.out.println(" a palindrome");
        } else {
            System.out.println(" not a palindrome");
        }

    }
}
