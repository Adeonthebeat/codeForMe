package studyForMe.Lecture06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * [이분검색]
 */
public class Lecture08 {

    public int solution(int n, int k, int[] arr) {
        int result = 0;

        Arrays.sort(arr);

        int lt = 0, rt = n-1;

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            if(arr[mid] == k) {
                result = mid + 1;
                break;
            }

            // K보다 크다는 건 너무 오른쪽에 있다는 것
            if(arr[mid] > k) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture08 main = new Lecture08();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));

    }

}
