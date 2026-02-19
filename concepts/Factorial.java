package concepts;

public class Factorial {

    public static void main(String[] args) {

        int num = 4;
        int result = factorial(num);
        System.out.println(result);

    }

    public static int factorial(int n){

        if(n == 0){
            return 1;
        }

        return n*factorial(n-1);
    }

}
