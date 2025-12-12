//  #2309_ 일곱 난쟁이

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws  IOException {

        Scanner sc = new Scanner(System.in);
        // 아홉 난쟁이 키 < 100 자연수
        int[] a = new int[9];
        int totalSum = 0;
        for(int i = 0; i < 9; i++){
            a[i] = sc.nextInt();
            totalSum += a[i];
        }

        // 1. 일곱 난쟁이 찾기
        /**
         * 생각의 흐름
         * 9명 중에서 7명을 고르는 것보다
         * 7명에 속하지 않을 2명을 찾는게 빠르지 않을까??
         * -> 9명의 키를 다 더한 다음, 2명의 키의 합을 뺏을 때 100이면 된다.*/
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 9; j++){
                int temp = a[i] + a[j];
                if(totalSum - temp == 100){
                    a[i] = 0;
                    a[j] = 0;

                    // 2. 오름차순으로 정렬
                    Arrays.sort(a);
                    for(int k = 2; k<9; k++){
                        System.out.println(a[k]);
                    }
                    return;
                }
            }
        }


    }


}