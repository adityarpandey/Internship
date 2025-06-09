package internship;
import java.util.Scanner;
import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        // no of roll
        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();
        int total = 0;
        System.out.println("how many times you want to roll the dice: ");
        int numberOfRoll = scanner.nextInt();
        if(numberOfRoll>0) {
            for (int i = 0; i < numberOfRoll; i++) {
                int roll = random.nextInt(1,7);
                System.out.println("you rolled the dice: " + roll );
                total += roll;

            }
            System.out.println("your total is: " + total );
        }
        else{
            System.out.println("wrong input ");
        }


    }
}
