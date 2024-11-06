package studyForMe;

import java.util.Scanner;

/**
 * 문자 찾기
 */
public class Lecture01 {

    public int solution(String str, char t) {
        int result = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if(x == t) {
                result += 1;
            }
        }

        return result;
    }

    /**
     * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     * Computercooler
     * c
     */
    public static void main(String[] args) {

        Lecture01 T = new Lecture01();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char t = input.next().charAt(0);

        System.out.println(T.solution(str, t));

    }

}
