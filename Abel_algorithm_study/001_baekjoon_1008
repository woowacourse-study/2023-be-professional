# 001. 백준 1388번 문제 - 바닥 장식

## 문제

형택이는 건축가이다. 지금 막 형택이는 형택이의 남자 친구 기훈이의 집을 막 완성시켰다. 형택이는 기훈이 방의 바닥 장식을 디자인했고, 이제 몇 개의 나무 판자가 필요한지 궁금해졌다. 나무 판자는 크기 1의 너비를 가졌고, 양수의 길이를 가지고 있다. 기훈이 방은 직사각형 모양이고, 방 안에는 벽과 평행한 모양의 정사각형으로 나누어져 있다.

이제 ‘-’와 ‘|’로 이루어진 바닥 장식 모양이 주어진다. 만약 두 개의 ‘-’가 인접해 있고, 같은 행에 있다면, 두 개는 같은 나무 판자이고, 두 개의 ‘|’가 인접해 있고, 같은 열에 있다면, 두 개는 같은 나무 판자이다.

기훈이의 방 바닥을 장식하는데 필요한 나무 판자의 개수를 출력하는 프로그램을 작성하시오.

<br/>

## 입력

첫째 줄에 방 바닥의 세로 크기N과 가로 크기 M이 주어진다. 둘째 줄부터 N개의 줄에 M개의 문자가 주어진다. 이것은 바닥 장식 모양이고, '-‘와 ’|‘로만 이루어져 있다. N과 M은 50 이하인 자연수이다.

<br/>

## 출력

첫째 줄에 문제의 정답을 출력한다.

<br/>

## 예제 입력 1

입력

```java
4 4
----
----
----
----
```

출력

```java
4
```

<br/>

## 예제 입력 2

입력

```java
4 4
----
----
----
----
```

출력

```java
4
```

<br/>

## Abel 풀이

```java
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    void run () throws IOException {
        String[] inputArr = br.readLine().split(" ");
        int n = Integer.parseInt(inputArr[0]);
        int m = Integer.parseInt(inputArr[1]);
        String[][] map = new String[n][m];
        int cnt = 0;
        
        // 2차원 배열에 입력된 장판들 배치
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = line[j];
            }        
        }
        
        // 2차원 배열을 돌면서 이어져있는 장판의 개수를 구하기
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                
                // 해당하는 장판이 있다면, 각각의 dfs를 통해 이어져있는 장판 탐색하기
                if (map[i][j].equals("-") || map[i][j].equals("|")) {
                    
                    // 장판 하나당 카운트 +1
                    cnt++;
                    
                    // 가로 장판일 시, rightBarDfs
                    // 세로 장판일 시, downBarDfs
                    if (map[i][j].equals("-")) {
                        rightBarDfs(map, i, j);
                    } else if(map[i][j].equals("|")) {
                        downBarDfs(map, i, j);
                    }
                }
            }
        }
        
        System.out.println(cnt);
        
        br.close();
    }
    
    public void rightBarDfs(String[][] map, int i, int j) {
        // 오른쪽으로 더이상 탐색할 수 없는 경우 바로 리턴
        if (j >= map[0].length) {
            return;
        }
        
        // 가로 장판인 경우
        // 1. 다시는 여길 탐색하지 않도록, 해당 장판을 전혀 상관없는 문자열인 a로 변경한다.
        // 2. 그후 오른쪽으로 탐색을 한 번 더 진행한다.
        if (map[i][j].equals("-")) {
            map[i][j] = "a";
            rightBarDfs(map, i, j+1);
        }
    }
    
    public void downBarDfs(String[][] map, int i, int j) {
        // 아래로 더이상 탐색할 수 없는 경우 바로 리턴
        if (i >= map.length) {
            return;
        }
        
        // 세로 장판인 경우
        // 1. 다시는 여길 탐색하지 않도록, 해당 장판을 전혀 상관없는 문자열인 a로 변경한다.
        // 2. 그후 아래로 탐색을 한 번 더 진행한다.
        if (map[i][j].equals("|")) {
            map[i][j] = "a";
            downBarDfs(map, i+1, j);
        }
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}
```

