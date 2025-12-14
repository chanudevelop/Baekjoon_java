//  #10448_유레카이론

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //사과
        int b = sc.nextInt(); // 바나나

        // 출력: 친구 수, 사과, 바나나

        /**
         * a, b의 공약수 찾기
         * 4, 8
         * 1 4, 8
         * 2 2, 4
         * 3 X
         * 4 1, 2
         * 5 X
         * 방법 1. 더 작은 숫자까지 범위로 brute force
         * 1000까지.
         * */

        if(a >= b){
            // 사과가 더 많을 때
            for(int i = 1; i <= b; i++){
                if((a % i == 0) && (b % i == 0))
                    System.out.println(i + " " + a/i + " " + b/i);
            }
        }else{
            for(int j = 1; j <= a; j++){
                if((a % j == 0) && (b % j == 0))
                    System.out.println(j + " " + a/j + " " + b/j);

            }
        }
    }

}
