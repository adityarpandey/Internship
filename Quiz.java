package internship;

import java.util.Scanner;

public class Quiz {
    Scanner scanner = new Scanner(System.in);

        String[] question = {
                "What is the capital of France?", // 0
                "Who painted the Mona Lisa?", // 1
                "What is the largest planet in our solar system?", // 2
                "In what year did the Titanic sink?", // 3
                "Who is the author of 'Harry Potter'?", // 4
                "What is the smallest prime number?", // 5
                "Which country is known as the Land of the Rising Sun?", // 6
                "What is the square root of 144?", // 7
                "Who was the first President of the United States?", // 8
                "What element does 'O' represent on the periodic table?" // 9
        };
        String[][] options = {
                {"Paris", "London", "Berlin", "Madrid"}, // Options for Q0
                {"Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Claude Monet"}, // Options for Q1
                {"Jupiter", "Saturn", "Earth", "Mars"}, // Options for Q2
                {"1912", "1905", "1920", "1898"}, // Options for Q3
                {"J.K. Rowling", "George R.R. Martin", "J.R.R. Tolkien", "Suzanne Collins"}, // Options for Q4
                {"1", "2", "3", "4"}, // Options for Q5
                {"Japan", "China", "Korea", "Thailand"}, // Options for Q6
                {"12", "14", "10", "16"}, // Options for Q7
                {"George Washington", "Abraham Lincoln", "Thomas Jefferson", "John Adams"}, // Options for Q8
                {"Oxygen", "Ozone", "Osmium", "Opium"} // Options for Q9
        };

        int[] answers = {
                0, // Correct answer for Q0: "Paris" (index 0 in options array)
                0, // Correct answer for Q1: "Leonardo da Vinci" (index 0 in options array)
                0, // Correct answer for Q2: "Jupiter" (index 0 in options array)
                0, // Correct answer for Q3: "1912" (index 0 in options array)
                0, // Correct answer for Q4: "J.K. Rowling" (index 0 in options array)
                1, // Correct answer for Q5: "2" (index 1 in options array)
                0, // Correct answer for Q6: "Japan" (index 0 in options array)
                0, // Correct answer for Q7: "12" (index 0 in options array)
                0, // Correct answer for Q8: "George Washington" (index 0 in options array)
                0  // Correct answer for Q9: "Oxygen" (index 0 in options array)
        };



    void run(String[]question,String[][] options,int[] answer){
        int score = 0;
        for(int j=0;j< question.length;j++)
        {
            System.out.println(question[j]);
            for(String option : options[j] ){
                System.out.println(option);
            }
            int gusse = scanner.nextInt();
            if(gusse == answer[j]+1){
                System.out.println("correct");
                score++;
            }
            else{
                System.out.println("wrong");
            }
        }

    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.run(quiz.question, quiz.options, quiz.answers);
    }
}
