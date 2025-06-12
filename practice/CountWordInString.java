package practice;

import java.util.Scanner;

public class CountWordInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the one sentence :");
        String str = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            try {
                if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                    count++;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("index out of bound");
            }
        }


    }
}
