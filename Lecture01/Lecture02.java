package studyForMe.Lecture01;

import java.util.Scanner;

/**
 * 대소문자변환
 */
public class Lecture02 {

    public String solution(String str) {
        String result = "";

        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Lecture02 T = new Lecture02();
        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println(T.solution(str));

    }

}
