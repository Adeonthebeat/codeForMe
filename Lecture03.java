package studyForMe;

import java.util.Scanner;

/**
 * 문장속단어
 */
public class Lecture03 {

    public String solution(String str) {
        String result = "";

        int MIN = Integer.MIN_VALUE;

        String[] strings = str.split(" ");

        for(String s : strings) {
            int len = s.length();

            if(len > MIN) {
                MIN = len;
                result = s;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Lecture03 T = new Lecture03();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        // it is time to study
        System.out.println(T.solution(str));

    }

}
