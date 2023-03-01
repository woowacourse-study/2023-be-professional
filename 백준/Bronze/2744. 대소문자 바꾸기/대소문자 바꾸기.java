import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String answer = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            answer += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }

        System.out.println(answer);
    }
}
