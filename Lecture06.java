package studyForMe;

import java.util.Scanner;

/**
 * 중복문자 제거
 */
public class Lecture06 {

    public String solution(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " || " + str.indexOf(str.charAt(i)));
            if(i == str.indexOf(str.charAt(i))){
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture06 T = new Lecture06();
        Scanner input = new Scanner(System.in);

        String str = input.next();
        System.out.println(T.solution(str));

    }

}
