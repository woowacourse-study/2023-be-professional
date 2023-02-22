import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 우가
 * @version 1.0.0
 * @Created by 우가 on 2023/02/22
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        String[] integers = br.readLine().split("");
        int sum = 0;
        for (String integer : integers) {
            sum += Integer.parseInt(integer);
        }
        System.out.println(sum);
    }
}
