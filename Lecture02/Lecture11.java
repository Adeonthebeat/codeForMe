package studyForMe.Lecture02;

import java.util.Scanner;

/**
 * 임시반장
 */
public class Lecture11 {


    public int solution(int n, int[][] arr) {
        int result = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            int cnt = 0;
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt += 1;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture11 main = new Lecture11();
        Scanner input = new Scanner(System.in);

        int n =  input.nextInt();
        int[][] arr = new int[n+1][n+1];

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));

    }

}
