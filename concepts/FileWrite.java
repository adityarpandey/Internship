package concepts;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        String line;
        try(FileWriter writer = new FileWriter ("text.txt")) {
            writer.write("hello");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("something went wrong");
        }


    }
}
