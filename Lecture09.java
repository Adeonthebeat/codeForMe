package studyForMe;

import java.util.Scanner;

/**
 * 숫자만 추출
 */
public class Lecture09 {

    public int solution(String str) {
        int ret = 0;
        String result = "";

        for(char rs : str.toCharArray()) {
            if(Character.isDigit(rs)) {
                result += rs;
            }
        }

        ret = Integer.parseInt(result);

        return ret;
    }

    public static void main(String[] args) {
        Lecture09 T = new Lecture09();
        Scanner input = new Scanner(System.in);

        String str = input.next();
        System.out.println(T.solution(str));

    }

}
