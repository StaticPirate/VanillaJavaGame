import java.util.Locale;
import java.util.Scanner;

public class Dungeon {

    public static boolean findWord(String searchWord, String stringToBeSearched) {
        if (stringToBeSearched.contentEquals(searchWord)) {
            return true;
        }
        return false;
    }

    public static void Greeting() {
        System.out.println("Welcome to the Dungeon!\n" +
                "Stop the game:  /stop");
    }

    public static void roomPicker(String response) {
        System.out.println("Pick Dungeon Theme:\n" +
                "Ice\n" +
                "Fire\n" +
                "Stone\n");
        System.out.println("Please pick one of the options.");

        tools.scannerResponse();

        if (findWord(response, "ice")) {
            rooms.iceDungeon();
        } else if (findWord(response, "fire")) {
            rooms.fireDungeon();
        } else if (findWord(response, "stone")) {
            rooms.stoneDungeon();
        } else {
            System.out.println("Please pick one of the options.");
        }
    }
}
