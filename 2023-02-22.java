import java.util.*;

public class Main {
	public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = scanner.next();
        String[] split = s.split("");
        int i3 = 0;
        for (String s1 : split) {
            int i1 = Integer.parseInt(s1);
            i3 += i1;
        }
        System.out.println(i3);

    
    	}
}
