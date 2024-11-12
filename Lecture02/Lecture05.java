package studyForMe.Lecture02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 */
public class Lecture05 {

    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int[] array = new int[n+1];

        for(int i = 2; i <= n; i++) {
            array[i] = i;
        }

        for(int i = 2; i <= n; i++) {
            if(array[i] == 0) {
                continue;
            }

            for(int j = 2 * i; j <= n; j += i) {
                array[j] = 0;
            }
        }

        for(int i = 2; i <= n; i++) {
            if(array[i] != 0) {
                result.add(array[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture05 T = new Lecture05();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Integer> resultList = T.solution(n);

        System.out.println("헤에! : " + resultList.size());

        for(int x : resultList) {
            System.out.print(x + " ");
        }

    }

}
