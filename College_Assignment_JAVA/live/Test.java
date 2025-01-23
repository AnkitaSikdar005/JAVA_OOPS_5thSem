package live;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an instrument to play:");
        System.out.println("1. Veena");
        System.out.println("2. Saxophone");
        int choice = sc.nextInt();

        Playable instrument;

        switch (choice) {
            case 1:
                instrument = new Veena();
                System.out.println("Playing Veena:");
                instrument.play();
                break;
            case 2:
                instrument = new Saxophone();
                System.out.println("Playing Saxophone:");
                instrument.play();
                break;
            default:
                System.out.println("Invalid choice. Please select either 1 or 2.");
                break;
        }
        
        sc.close();
    }
}

