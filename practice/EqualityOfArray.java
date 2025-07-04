package practice;

import java.util.Arrays;

public class EqualityOfArray {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {1, 2, 3, 4, 5};

        boolean check = Arrays.equals(num1, num2);
        System.out.println(check);
    }
}
