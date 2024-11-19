package studyForMe.Lecture03;

import java.util.Scanner;

/**
 * 연속부분수열
 */
public class Lecture04 {

    public int solution(int n, int m, int[] arr) {

        int result = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            if(sum == m) {
                result += 1;
            }

            while(sum >= m) {
                sum -= arr[lt++];
                if(sum == m) {
                    result += 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture04 main = new Lecture04();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, m, arr));

    }

}
