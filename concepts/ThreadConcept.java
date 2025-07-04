package concepts;
import java.util.Scanner;

public class ThreadConcept {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        Scanner scanner = new Scanner(System.in);
        thread.setDaemon(true);
        thread.start();
        String name;
        System.out.println("you have 5 seconds to enter your name");
        System.out.print("Enter your name: " );
        name = scanner.nextLine();
        System.out.println("hello "+name);
    }
}
