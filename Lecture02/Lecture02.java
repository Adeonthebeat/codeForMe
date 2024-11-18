package studyForMe.Lecture02;

import java.util.Scanner;

/**
 * 보이는 학생
 */
public class Lecture02 {

    public int solution(int[] array) {

        // 선생님 관점
        int result = 1;

        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                result += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture02 T = new Lecture02();
        Scanner input = new Scanner(System.in);

        int inputCnt = input.nextInt();

        int[] array = new int[inputCnt];

        for(int i = 0; i < inputCnt; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(T.solution(array));

    }

}
