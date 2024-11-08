package studyForMe;

import java.util.Scanner;

/**
 * 유효한 팰린드롬
 */
public class Lecture08 {

    public String solution(String str) {
        String result = "NO";

        str = str.replaceAll("[^A-Z]", "");

        String reverse = new StringBuilder(str).reverse().toString();

        if(str.equals(reverse)) {
            return "YES";
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture08 T = new Lecture08();
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        System.out.println(T.solution(str));

    }

}
