//  점수 집계

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 5명 심판, 최고점과 최저점을 뺀 나머지 3명 점수의 최고점과 최저점의 차이가 4 이상 나면 조정을 해서 점수 다시
        // 점수를 집계해서 총점 또는 KIN(재집계하라) 출력하기
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] scores = new int[5];
            for(int j=0; j<5;j++){
                scores[j] = Integer.parseInt(st.nextToken());
            }
            // 오름차순정렬
            Arrays.sort(scores);
            // 2번째와 4번째 차이 계산
            int diff = scores[3] - scores[1];
            if(diff >= 4){
                System.out.println("KIN");
            }else System.out.println(scores[1]+scores[2]+scores[3]);
        }


    }
}