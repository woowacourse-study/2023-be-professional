```java
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        Num[] arr = new Num[Integer.parseInt(br.readLine())];
        List<Num> tmp = new ArrayList<>();
        
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = new Num();
            tmp.add(arr[i - 1]);
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                tmp.add(tmp.remove(0));
            }
            tmp.remove(0).value = i + 1;
        }
        
        tmp.get(0).value = arr.length;
        
        for (Num n : arr) {
            sb.append(n.value).append(" ");
        }
        
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    class Num {
        public int value;
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}
```