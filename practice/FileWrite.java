package practice;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        String line;
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.write("hello");
            FileReader fileReader = new FileReader("text.txt");
            BufferedReader reader = new BufferedReader(new FileReader("text.txt");
            while ((line = reader.readLine()) != null) {

            }


        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("input error");
        }
    }
}
