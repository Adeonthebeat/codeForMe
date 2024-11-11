package studyForMe.Lecture01;

import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 */
public class Lecture10 {

    public int[] solution(String str, char target) {
        int result[] = new int[str.length()];
        int p = 1000;

        // LEFT
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                p = 0;
                result[i] = p;
            } else {
                p += 1;
                result[i] = p;
            }
        }

        p = 1000;
        // RIGHT
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == target) {
                p = 0;
                result[i] = p;
            } else {
                p += 1;
                result[i] = Math.min(result[i], p);
            }
        }

        return result;
    }

    // teachermode e
    public static void main(String[] args) {
        Lecture10 T = new Lecture10();
        Scanner input = new Scanner(System.in);

        String str = input.next();
        char target = input.next().charAt(0);
        for(int x: T.solution(str, target)) {
            System.out.print(x + " ");
        }
    }

}
