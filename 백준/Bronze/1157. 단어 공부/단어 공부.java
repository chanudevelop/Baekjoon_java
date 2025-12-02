//  단어 공부

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();

        // 카운트배열
        int[] alphabetCount = new int[26];
        for(int i = 0; i<str.length(); i++){
            alphabetCount[str.charAt(i) - 'a']++;
        }

        // 카운트 배열을 처음부터 돌면서 가장 큰값 찾기
        int idx = 0; // 가장 많이 사용된 알파벳의 인덱스
        int max = 0; // 가장 많이 사용된 알파벳의 수
        boolean isMany = false; // 가장 많이 사용된 알파벳이 여러개 존재하는지
        for(int i = 0; i<26; i++){
            if(alphabetCount[i] > max){
                max = alphabetCount[i];
                idx = i;
                isMany = false;
            }else if(alphabetCount[i] == max){
                isMany = true;
            }
        }

        // 출력
        if(isMany){
            System.out.println("?");

        }else{
            char ans = (char)(idx + 'A');
            System.out.println(ans);
        }

    }
}