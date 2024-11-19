package studyForMe.Lecture03;

import java.util.Scanner;

/**
 * 연속부분수열
 */
public class Lecture05 {

    public int solution(int n) {

        int result = 0, lt = 0, sum = 0;

        int m = n/2 + 1;
        int[] arr = new int[m];

        for(int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for(int rt = 0; rt < m; rt++) {
            sum += arr[rt];

            if(sum == n) {
                result += 1;
            }

            while(sum >= n) {
                sum -= arr[lt++];

                if(sum == n) {
                    result += 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture05 main = new Lecture05();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(main.solution(n));

    }

}
