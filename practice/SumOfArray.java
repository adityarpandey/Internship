package practice;

public class SumOfArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int len = num.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + num[i];
            if (num[i] % 2 == 0) {
                System.out.println("this element is even " + num[i]);

            } else {
                System.out.println("this number is odd " + num[i]);
            }
        }
        System.out.println("the sum of array " + sum);
    }
}
