package studyForMe.Lecture01;

import java.util.Scanner;

/**
 * 특정단어 뒤집기
 */
public class Lecture05 {

    public String solution(String str) {
        String result = "";

        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) {
                // 특수문자 왼쪽
                lt++;
            } else if(!Character.isAlphabetic(chars[rt])) {
                // 특수문자 오른쪽
                rt--;
            } else {
                // 알파벳
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }

        result += String.valueOf(chars);

        return result;
    }

    public static void main(String[] args) {
        Lecture05 T = new Lecture05();
        Scanner input = new Scanner(System.in);

        String str = input.next();
        System.out.println(T.solution(str));

    }

}
