package practice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the String name you want to check : ");
        String name = scanner.nextLine();
        String rev = "";
        int len = String.valueOf(name).length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
        if (name.equals(rev)) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " is not palindrome");
        }


    }
}
