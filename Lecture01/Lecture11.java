package studyForMe.Lecture01;

import java.util.Scanner;

/**
 * 문자열 압축
 */
public class Lecture11 {

    public String solution(String str) {
        String result = "";

        str = str + " ";
        int cnt = 1;

        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                cnt += 1;
            } else {
                result += str.charAt(i);

                if(cnt > 1) {
                    result += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture11 T = new Lecture11();
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        System.out.println(T.solution(str));
    }

}
