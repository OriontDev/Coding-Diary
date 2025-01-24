
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main{
    public static void main(String[] args) {
        String filePath = "Sukidakara.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in); 
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){
                //Clear screen!
                System.out.print("\033[H\033[2J");
                System.out.flush(); 

                System.out.println("==== Sukidakara - Yuika ====");

                System.out.println("P = Play");
                System.out.println("S = Stop/Pause");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Insert Response : ");

                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid input");
                }
            }
        } 
        catch(UnsupportedAudioFileException e){
            System.out.println("File format not supported!");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource!");
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot not locate file");
        }
        catch(IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}