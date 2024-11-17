package studyForMe.Lecture02;

import java.util.Scanner;

/**
 * 멘토링
 */
public class Lecture12 {


    public int solution(int n, int m, int[][] arr) {
        int result = 0;

        for(int i = 1; i <= n; i++) {// 멘토
            for(int j = 1; j <= n; j++) {// 멘티 -> 등수비교 학생
                int cnt = 0;
                for(int k = 0; k < m; k++) { // 각 테스트 등수
                    int pi = 0, pj = 0; // pi.멘토등수, pj.멘티등수
                    for(int s = 0; s < n; s++) {

                        if(arr[k][s] == i) {
                            pi = s;
                        }

                        if(arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    // 등수가 크다는건 공부를 못한다는 것.
                    if(pi < pj) {
                        cnt += 1;
                    }
                }
                if(cnt == m) {
                    // cnt와 테스트 수가 같다면 모든 테스트에서 멘토의 점수가 높은 것.
                    result += 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture12 main = new Lecture12();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println(main.solution(n, m, arr));

    }

}
