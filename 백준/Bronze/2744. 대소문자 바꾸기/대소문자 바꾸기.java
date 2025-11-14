//  대소문자 바꾸기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 소문자인지 대문자인지에 따라 달라진다
        String input = sc.nextLine();
        int len = input.length();
        String answer = "";
        for(int i = 0; i<len; i++){
            if(Character.isUpperCase(input.charAt(i))){ // 해당 문자가 대문자일 때
                char temp = Character.toLowerCase(input.charAt(i));
                answer += temp;
            }else{ // 해당 문자가 소문자일 때
                char temp = Character.toUpperCase(input.charAt(i));
                answer += temp;
            }
        }
        System.out.println(answer);

    }
}