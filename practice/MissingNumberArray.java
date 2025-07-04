package practice;

import java.util.Arrays;

public class MissingNumberArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6};
        int sum1 = 0;
        int sum2 = 0;
        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());

        for (int j : array) {
            sum1 = sum1 + j;

        }
        for (int i = 1; i <= 6; i++) {
            sum2 = sum2 + i;

        }
        System.out.println("the missing number is :" + (sum2 - sum1));
    }
}
