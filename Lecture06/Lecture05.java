package studyForMe.Lecture06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 중복확인
 */
public class Lecture05 {

    public String solution(int n, int[] arr) {
        String result = "U";

        Arrays.sort(arr);

        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]){
                return "D";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture05 main = new Lecture05();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }
}
