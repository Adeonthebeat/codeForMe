package studyForMe;

import java.util.Scanner;

/**
 * 회문문자열
 */
public class Lecture07 {

    public String solution(String str) {
        String result = "YES";

        int len = str.length();
        str = str.toUpperCase();

        for(int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len - 1 - i)){
                return "NO";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture07 T = new Lecture07();
        Scanner input = new Scanner(System.in);

        String str = input.next();
        System.out.println(T.solution(str));

    }

}
