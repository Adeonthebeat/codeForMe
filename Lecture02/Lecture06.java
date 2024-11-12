package studyForMe.Lecture02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 */
public class Lecture06 {

    /**
     * [소수 판별]
     * @param num
     * @return
     */
    public boolean isPrime(int num) {

        if(num == 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) {
            int temp = array[i];
            int res = 0;

            while(temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            if(isPrime(res)) {
                result.add(res);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Lecture06 T = new Lecture06();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        ArrayList<Integer> resultList = T.solution(n, array);

        for(int x : resultList) {
            System.out.print(x + " ");
        }
    }

}
