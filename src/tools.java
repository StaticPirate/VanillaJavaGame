import java.util.Scanner;

public class tools {

    public static String response = "";

    public static String scannerResponse() {
        Scanner scanner = new Scanner(System.in);
        String placeholder = scanner.nextLine();
        return placeholder.toLowerCase();
    }
}
