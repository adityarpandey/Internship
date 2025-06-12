package practice;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String name;
        System.out.print("enter string you want to reverse :");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        int len = name.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

    }
}
