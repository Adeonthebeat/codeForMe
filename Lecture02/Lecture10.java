package studyForMe.Lecture02;

import java.util.Scanner;

/**
 * 봉우리
 */
public class Lecture10 {

    int[] dx = {-1, 0, 1, 0}; // 북남
    int[] dy = {0, 1, 0, -1}; // 동서

    public int solution(int n, int[][] arr) {
        int result = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                boolean flag = true;

                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    result += 1;
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture10 main = new Lecture10();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));

    }

}
