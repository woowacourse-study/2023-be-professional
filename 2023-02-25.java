import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean flag = true;
		StringBuilder sb;
		while (flag) {
			String s = br.readLine();
			if (s.equals("END")) {
				break;
			}
			sb = new StringBuilder(s);
			System.out.println(sb.reverse());
		}
	}
}

