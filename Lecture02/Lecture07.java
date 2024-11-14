package studyForMe.Lecture02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 점수계산
 */
public class Lecture07 {

    public int solution(int n, int[] arr) {

        int sum = 0;
        int result = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                result += 1;
            } else {
                result = 0;
            }
            sum += result;
        }

        return sum;
    }

    public static void main(String[] args) {
        Lecture07 main = new Lecture07();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }


}
