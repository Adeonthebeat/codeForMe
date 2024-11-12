package studyForMe.Lecture02;

import java.util.Scanner;

/**
 * 가위바위보
 */
public class Lecture03 {


    public String solution(int n, int[] arrayA, int[] arrayB) {
        StringBuilder result = new StringBuilder();

        // 1:가위, 2:바위, 3:보
        for(int i = 0; i < n; i++) {
            if(arrayA[i] == arrayB[i]) {
                result.append("D");
            } else if(arrayA[i] == 1 && arrayB[i] == 3) {
                result.append("A");
            } else if(arrayA[i] == 2 && arrayB[i] == 1) {
                result.append("A");
            } else if(arrayA[i] == 3 && arrayB[i] == 2) {
                result.append("A");
            } else {
                result.append("B");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Lecture03 T = new Lecture03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arrayA = new int[n];
        for(int i = 0; i < n; i++) {
            arrayA[i] = input.nextInt();
        }

        int[] arrayB = new int[n];
        for(int i = 0; i < n; i++) {
            arrayB[i] = input.nextInt();
        }

        String result = T.solution(n, arrayA, arrayB);

        for(char x : result.toCharArray()) {
            System.out.println(x);
        }

    }

}
