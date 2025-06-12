package practice;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        int a;
        int b;
        int rev = 0;
        int rev2 = 0;
        int newA = 0;
        int newB = 0;
        int c = 0;
        int newC = 0;
        int c1 = 0;
        int rev3 = 0;
        int d = 0;
        int rev4 = 0;

        for (int i = 100000; i < 999999; i++) {
            //System.out.println(i);
            for (int j = 0; j < 4; j++) {
                a = i % 10000;
                newA = a;
                rev = rev * 10 + a % 10;
                a = a / 10;
                //System.out.println("going good 25");
                if (newA == rev) {

                    b = i + 1;
                    for (int k = 0; k < 5; k++) {

                        b = i % 100000;
                        newB = b;
                        rev2 = rev2 * 10 + b % 10;
                        b = b / 10;

                        if (rev2 == newB) {
                            c = i + 2;
                            c1 = c;
                            c = c / 10;

                            for (int l = 0; l < 4; l++) {
                                c = i % 10000;
                                newC = c;
                                rev3 = rev3 * 10 + c % 10;
                                c = c / 10;

                                if (newC == rev3) {
                                    c1 = i + 3;
                                    for (int m = 0; m < 6; m++) {
                                        d = c1;
                                        rev4 = rev4 * 10 + d % 10;
                                        d = d / 10;
                                        //System.out.println(rev4);
                                        if (c1 == rev4) {
                                            System.out.printf("this is what he saw on meter: %d%n", c1);
                                        }
                                    }
                                }
                            }
                        }


                    }


                }


            }


        }
    }

    public static class SumOfDigit {
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
}
