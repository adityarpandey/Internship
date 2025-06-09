package internship;
import java.util.ArrayList;
import java.util.Scanner;
public class HangMan {
    public static void main(String[] args) {
        String word = "h";
        int wrongGuess = 0;
        char guess;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();

        // Welcome To The Hang Man game
        System.out.println("Welcome To The Hang Man game");

        //Display Blank space for the word to guess
        System.out.print("your word is: ");
        for (int i = 0; i < word.length(); i++) {

            wordState.add('_');
        }
        while (wrongGuess < 6) {

            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Guess: ");
            guess = scanner.next().toLowerCase().charAt(0);
            if (word.indexOf(guess) >= 0) {
                System.out.println("CORRECT");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }


            } else {
                wrongGuess++;
                System.out.println("WRONG");


            }
            if (!wordState.contains('-')) {
                System.out.println("you WON!!!!");
                break;
            }
        }
    }
}

