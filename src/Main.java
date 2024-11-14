import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner sc = new Scanner(System.in);
        File file = new File("The Weeknd - Save Your Tears (Official Music Video).wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);


        String response = "";


        while (!response.equals("Q")) {
            System.out.println("\nP = Play");
            System.out.println("S = Stop");
            System.out.println("R = Reset");
            System.out.println("Q = Quit");
            System.out.print("Enter your choice: ");

            response = sc.next();
            response = response.toUpperCase();


            switch (response) {
                case "P":
                    clip.start();
                    break;

                case "S":
                     clip.stop();
                     break;

                case "R":
                    clip.setFramePosition(0);
                    break;

                case "Q":
                    clip.close();
                    break;

                    default:
                        System.out.println("Invalid Response\n\n");
            }
        }

        System.out.println("Good Bye!");


}
}