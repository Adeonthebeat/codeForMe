package studyForMe.Lecture01;

import java.util.Scanner;

/**
 * 단어뒤집기
 */
public class Lecture04 {

    public String solution(String str) {
        String result = "";

        for(int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture04 T = new Lecture04();
        Scanner input = new Scanner(System.in);

        int tot = input.nextInt();

        for(int i = 0; i < tot; i++) {
            String str = input.next();
            System.out.println(T.solution(str));
        }

    }

}
