//  애너그램 만들기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];
        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        // 카운트 배열: 배열을 이용해서 각 구성성분의 개수를 표현
        int[] countA = getAlphabetCount(A);
        int[] countB = getAlphabetCount(B);

        int ans = 0;
        for(int i = 0; i<26; i++)
            ans += Math.abs(countA[i] - countB[i]);
        System.out.println(ans);
    }
}