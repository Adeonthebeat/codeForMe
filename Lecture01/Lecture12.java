package studyForMe.Lecture01;

import java.util.Scanner;

/**
 * 문자열 압축
 */
public class Lecture12 {

    public String solution(int cnt, String str) {
        String result = "";

        for(int i = 0; i < cnt; i++) {
            String split = str.substring(0, 7).replace('#', '1').replace('*', '0');

            int num = Integer.parseInt(split, 2);

            result += (char) num;

            str = str.substring(7);
        }
        return result;
    }


    public static void main(String[] args) {
        Lecture12 T = new Lecture12();
        Scanner input = new Scanner(System.in);

        int cnt = input.nextInt();
        String str = input.next();

        System.out.println(T.solution(cnt, str));

    }

}
