```java
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] answer = new int[5];
    int cnt;
    String[][] map;
    
    void run () throws IOException {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        map = new String[1 + n * 5][1 + m * 5];
        
        for (int i = 0; i < 1 + n * 5; i++) {
            input = br.readLine().split("");
            for (int j = 0; j < 1 + m * 5; j++) {
                map[i][j] = input[j];
            }
        }
        
        for (int i = 1; i < map.length; i += 5) {
            for (int j = 1; j < map[0].length; j += 5) {
                dfs(i, j);
                answer[cnt]++;
                cnt = 0;
            }
        }
        
        for (int i : answer) {
            System.out.print(i + " ");
        }
        
        br.close();
    }
    
    public void dfs(int i, int j) {
        if (map[i][j].equals("*")) {
            cnt++;
            dfs(i + 1, j);
        }
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}
```