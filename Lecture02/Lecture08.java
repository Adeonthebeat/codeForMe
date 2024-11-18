package studyForMe.Lecture02;

import java.util.Scanner;

/**
 * 등수구하기
 */
public class Lecture08 {

    public int[] solution(int n, int[] arr) {
        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            int rank = 1;
            for(int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) {
                    rank += 1;
                }
            }
            result[i] = rank;
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture08 main = new Lecture08();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] resultList = main.solution(n, arr);

        for(int x : resultList) {
            System.out.print(x + " ");
        }


    }

}
