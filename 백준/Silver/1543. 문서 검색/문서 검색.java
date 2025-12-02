//  #1543_문서 검색

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        /**
         * 영어로만 이루어진 문서를 검색하는 함수
         * 어떤 단어가 총 몇번 등장하는지
         * 중복되는경우는 빼고 세야한다
         * 시작 인덱스랑 끝 인덱스를 구해서 겹치지 않게 해결
         * */

        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine(); // 문서
        String vocab = sc.nextLine(); // 단어
        int ans = 0; //몇번 등장하는지

        while(true){
            int idx = document.indexOf(vocab);
            if(idx == -1) break;

            ans++;
            document = document.substring(idx + vocab.length());

        }

        System.out.println(ans);

    }
}