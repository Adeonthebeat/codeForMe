package studyForMe.Lecture02;

import java.util.Scanner;

/**
 * 피보나치 수열
 */
public class Lecture04 {

    public int[] solution(int n) {
        int[] retList = new int[n];

        retList[0] = 1;
        retList[1] = 1;

        for(int i = 2; i < n; i++) {
            int res = retList[i-2] + retList[i-1];
            retList[i] = res;
        }

        return retList;
    }

    public static void main(String[] args) {
        Lecture04 T = new Lecture04();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] resultList = T.solution(n);

        for(int x : resultList) {
            System.out.print(x + " ");
        }

    }

}
