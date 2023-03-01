import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj11720 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int solution() throws IOException {
        br.readLine();
        return Arrays.stream(br.readLine().split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}
