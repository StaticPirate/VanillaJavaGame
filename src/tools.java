import java.util.Scanner;

public class tools {

    public String response = "";

    public void scannerResponse() {
        Scanner scanner = new Scanner(System.in);
        String placeholder = scanner.nextLine();
        response = placeholder.toLowerCase();
    }
}
