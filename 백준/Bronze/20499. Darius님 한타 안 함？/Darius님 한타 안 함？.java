//  Darius님 한타 안 함?

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String KDA = sc.nextLine();

        // 특정 문자를 기준으로 자를때 split()사용
        // String.split()은 지정한 문자를 기준으로 문자열을 잘라 배열로 반환한다
        String[] KDAArr = KDA.split("/");

        // 문자를 숫자로 바꾸기 = 변환메서드
        // Integer.parseInt(), Double.parseDouble(), Long.parseLong()
        int K = Integer.parseInt(KDAArr[0]);
        int D = Integer.parseInt(KDAArr[1]);
        int A = Integer.parseInt(KDAArr[2]);

        // 조건식: K + A < D 이거나  D = 0일 때
        if(K + A < D || D == 0){
            System.out.println("hasu"); // 가짜
        }else{
            System.out.println("gosu"); // 진짜
        }

    }
}