//  최소공배수

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int gcd(int a, int b){
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 테스트 케이스 만큼 반복
        for(int i = 0; i< num; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int g = gcd(A,B);

            int result = A / g * B;
            System.out.println(result);

        }
    }
}