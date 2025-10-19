//  새

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 나무에 N마리 있음
        // 1부터 오름차순 자연수 , K개 만큼 날라감
        // 만약 앉아있는 새 < K이면 1부터다시 시작
        // 1, 2, 3, 4, 1, 2, 1
        // 지속해서 올라가는거라서 반복문 써야할거같음

        int N = sc.nextInt(); // 나무에 앉아있는 새의 수
        int cnt = 1; // 자연수의 시작
        int time = 0; // 모든 새가 날라가기까지 걸리는 시간 (정답)
        while(N != 0){
            if(N >= cnt){
                N = N - cnt;
                cnt ++;
            }else{
                cnt = 1;
                N = N - cnt;
                cnt ++;
            }
            time++;
        }
        System.out.println(time);
    }
}