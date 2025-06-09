package internship;

import java.util.Random;
import java.util.Scanner;

public class Slot {
    public static void main(String[] args) {
        System.out.println(" welcome to slots");


        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter amount you want in your balance: " );
        int balance = scanner.nextInt();




        while(balance > 0) {
            System.out.print("enter your bet amount: ");
            int bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("insufficient funds");
            } else if (bet <= 0) {
                System.out.println("bet must be greater then zero");
            }
            else{
                balance -= bet;
                System.out.println("your current balance:" + balance);
            }


        spinRow();
        printRow(spinRow());


        }




    }
    static String[] spinRow(){
        Random random = new Random();
        String[] symbol = {"✔","💖","✨","🎃","🏀"};
        String[] row = new String[3];
        for(int i=0;i<row.length;i++){

        row[i] = symbol[random.nextInt(symbol.length)];
        }


        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | " ,row));
        System.out.println("your balance is zero");

    }

}
