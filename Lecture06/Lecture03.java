package studyForMe.Lecture06;

import java.util.Scanner;

/**
 * 삽입정렬
 * https://gmlwjd9405.github.io/2018/05/06/algorithm-insertion-sort.html
 */
public class Lecture03 {

    public int[] solution(int n, int[] arr) {

        // key값이 증가하면서 key값이 맞을떄까지 움직임
        for(int i = 1; i < n; i++) { // key
            int temp = arr[i], j;
            for(j = i-1; j >= 0; j--) {
                if(arr[j] > temp) {
                    // key보다 크다면. key와 SWAP
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            // key += 1
            arr[j+1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Lecture03 main = new Lecture03();
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
