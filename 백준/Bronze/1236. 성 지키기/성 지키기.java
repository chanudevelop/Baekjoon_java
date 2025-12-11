//  #13223_ 소금폭탄
// 시간 복잡도: O(N*M) + O(N*M) + O(N) + O(M) => O(NM)
// 문제 조건 N, M < 50 => 2500
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N, M <= 50
        int N = sc.nextInt(); // 세로
        int M = sc.nextInt(); // 가로
        char[][] map = new char[N][M];
        for(int i = 0; i < N; i++){ // O(N*M)
            map[i] = sc.next().toCharArray(); 
        }

        // 1. 각 행/열에 대해 경비원이 있는지 확인 -> O(N * M)
        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[M];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(map[i][j] == 'X'){
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }


        // 2. 보호받지 못하는 행/열의 개수 구하기
        int needRowCount = N;
        int needColCount = M;
        for(int i = 0; i<N;i++){ // -> O(N)
            if(existRow[i]) needRowCount--;
        }
        for(int i = 0; i < M; i++){ // -> O(M)
            if(existCol[i]) needColCount--;
        }

        // 3. 둘 중 큰 값을 출력
        System.out.println(Math.max(needRowCount, needColCount));
    }
}