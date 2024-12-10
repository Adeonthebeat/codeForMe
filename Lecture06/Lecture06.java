package studyForMe.Lecture06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 장난꾸러기
 */
public class Lecture06 {

    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        int[] temp = arr.clone();

        Arrays.sort(temp);

        for(int i = 0; i < n; i++) {
            if(temp[i] != arr[i]) {
                result.add(i+1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture06 main = new Lecture06();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
