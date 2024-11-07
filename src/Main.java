import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = tools.scannerResponse();

        Dungeon.Greeting();
        while (!response.equals("/stop")) {
            Dungeon.roomPicker();
        }
    }
}