//  숫자 게임

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N명, 1~10 카드 중 5장
        // 3장을 골라 합의 일의 자리수가 가장 큰 사람이 이김 (0~9)
        // 각 사람에 대해 최선을 찾고 그 최선중에 최고를 찾기 (중복 시 숫자자체가 더 큰사람이 이김)
             /*
        * 범위 3 ~ 30
        경우의 수: 5C3 -> 10가지  한 사람당 나올 수 있는 경우는 총 10가지
        * -> Brute force 가능
        * 다 구한다음 뒷자리가 가장 큰걸 저장 후 마지막에 비교
        * - 9인 경우 가지치기..?
        * */

        // 입력받기
        int num = Integer.parseInt(br.readLine());
        int[][] cards = new int[num][5];
        for(int i = 0; i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<5;j++){
                cards[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // (인사이트) 핵심로직: 각 사람(행)별 최댓값 찾기 + 전체 승자 결정
        int winner = -1; // 1-based index로 출력할 예정
        int best =-1; // 전체 최고 일의 자리

        for(int i =0; i<num;i++){
            //(0,1,2) (0,1,3) (0,1,4) (0,2,3) (0,2,4) (0,3,4) (1,2,3) (1,2,4) (1,3,4) (2,3,4)
            int rowBest = -1;
            outer: // 9 나오면 바로 다음 사람으로
            for(int a = 0; a<5; a++){
                for(int b = a+1; b<5; b++){
                    for(int c = b+1; c<5; c++){
                        int last = (cards[i][a] + cards[i][b]+ cards[i][c]) % 10;// 일의자리숫자
                        if(last > rowBest){
                            rowBest = last;
                            if(rowBest == 9) break outer;
                        }
                    }
                }
            }

            // 동점 시 번호가 더 큰 사람의 번호 출력
            if(rowBest >= best){
                best = rowBest;
                winner = i + 1;
            }
        }

        System.out.println(winner);

    }
}