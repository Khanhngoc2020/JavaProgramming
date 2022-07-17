package File;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner sc = new Scanner(System.in);

        File file = new File("C:\\Users\\khanh\\IdeaProjects\\HelloWorld\\src\\File\\Winning - NEFFEX.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
            String response = new String();

        while (!response.equals("q")) {
            System.out.println("P = PLAY \n S = STOP \n Q = QUIT \n R = RESET");
             response = sc.next();
            response = response.toLowerCase();
          
            switch (response) {
                case ("p"):
                    clip.start();
                    break;
                case ("s"):
                    clip.stop();
                    break;
                case ("r"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response");
            }
        }
        System.out.println("Byee!");
    }
}
