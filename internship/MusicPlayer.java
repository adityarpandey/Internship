package internship;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
      String filepath = "";
        File file = new File(filepath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream  = AudioSystem.getAudioInputStream(file);){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";
            while(!response.equals("Q")){

                System.out.println("welcome to the music player:🔊\n 1:Play Q\n2:Stop S\n3:Restart R\n4:Quit");
                response = scanner.next().toUpperCase();

                switch (response){
                    case"P" -> clip.start();
                    case"S" -> clip.stop();
                    case"R" -> clip.setMicrosecondPosition(0);
                    case"Q" -> response = "Q";
                }



            }
        }
        catch (LineUnavailableException e){
           System.out.println("Audio file is missing some thing ");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        catch (IOException e) {
            System.out.println("something went wrong");
        }

    }

}
