package studyForMe.Lecture03;

import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 */
public class Lecture06 {

    public int solution(int n, int k, int[] arr) {

        int result = 0, lt = 0, cnt = 0;

        for(int rt = 0; rt < n; rt++) {

            if(arr[rt] == 0) {
                cnt += 1;
            }

            while(cnt > k) {
                if(arr[lt] == 0) {
                    cnt -= 1;
                }
                // rt를 향해 나아감.
                lt += 1;
            }
            // rt - lt + 1 = 연속적 수열의 길이
            result = Math.max(result, rt - lt + 1);
        }

        return result;

    }

    public static void main(String[] args) {
        Lecture06 main = new Lecture06();
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
