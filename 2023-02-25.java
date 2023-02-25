
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if ("END".equals(input)) {
                return;
            }
            StringBuffer sb = new StringBuffer(input);
            String reverse = sb.reverse().toString();
            System.out.println(reverse);
        }
    }
}
