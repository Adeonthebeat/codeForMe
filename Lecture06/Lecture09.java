package studyForMe.Lecture06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * [뮤직비디오((결정알고리즘))]
 */
public class Lecture09 {

    public int count(int[] arr, int capacity) {
        int cnt = 1; // DVD 개수
        int sum = 0; // DVD안의 곡들의 합

        for(int x : arr) {
            if((sum + x) > capacity) {
                cnt += 1;
                sum = x;
            } else {
                sum += x;
            }
        }

        return cnt;
    }

    public int solution(int n, int k, int[] arr) {
        int result = 0;

        // 1 2 3 4 5 6 7 8 9
        // 최소와 최대값은 9 <-> 45다. 최소와 최대값을 더한 45+9 = 54 / 2를 최소의 용량이라고 생각하고 각각의 노래를 연속해서 담을 수 있는지 확인한다.
        int lt = Arrays.stream(arr).max().getAsInt();// 가장 큰수
        int rt = Arrays.stream(arr).sum(); // 모든 수의 합

        while(lt <= rt) {
            int mid = (lt + rt) / 2; // DVD 한장의 용량

            if(count(arr, mid) <= k) {
                // DVD 장수가 k보다 작거나 같으면 만족하는 용량.
                result = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Lecture09 main = new Lecture09();
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
