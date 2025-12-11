//  #13223_ 소금폭탄

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int P = sc.nextInt(); // 테스트케이스 수
        int[][] map = new int[P][20];
        for(int i = 0; i<P; i++){
            sc.nextInt();
            for(int j= 0; j<20; j++){
                map[i][j] = sc.nextInt();
            }
        }
        // 1. 삽입 인덱스 찾기
        // 2 인덱스 뒤에 있는 요소 갯수 세기
        // 3. 총합 증가시키기

        int[] count = new int[P]; // 답 - 학생들이 뒤로 물러난 걸음 수의 총합

        for(int i = 0; i<P; i++){               // 각 케이스별로
            int[] temp = new int[20];

            // 1. 삽입 인덱스 찾기
            for(int j = 0; j<20; j++){          // 케이스에는 20명의 학생이 존재
                int cur = map[i][j];            // 들어가야할 학생 키
                if(j == 0) temp[0] = cur; // 처음은 맨 앞 인덱스에 위치
                else{
                    for(int k= 0; k < j; k++){
                        if(cur < temp[k]){
                            for(int m = j-1; m >= k; m--) temp[m+1] = temp[m]; // 뒤로 이동
                            temp[k] = cur; // 그 자리에 넣기
                            count[i] += j-k; // 뒤에 학생 수 더하기
                            break;
                        }else{
                            temp[j] = cur;
                        }
                    }
                }
            }
        }

        // 출력
        for(int i = 0; i<P; i++){
            System.out.println(i+1 +" " +count[i]);
        }
    }
}