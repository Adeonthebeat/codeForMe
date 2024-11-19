package studyForMe.Lecture03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 최대매출
 */
public class Lecture03 {

    public int solution(int n, int k, int[] arr) {
        int result = 0, sum = 0;

        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        for(int i = k; i < n; i++) {
            sum += (arr[i] - arr[i-k]);
            result = Math.max(result, sum);
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture03 main = new Lecture03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));

    }

}
