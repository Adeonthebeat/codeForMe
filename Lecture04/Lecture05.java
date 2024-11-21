package studyForMe.Lecture04;

import java.util.*;

/**
 * K번째 큰 수
 */
public class Lecture05 {

    public int solution(int n, int k, int[] arr) {
        int result = -1;

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int l = j+1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 1;
        for(int x : treeSet) {
            if(cnt == k) {
                result = x;
            }
            cnt += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture05 main = new Lecture05();
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
