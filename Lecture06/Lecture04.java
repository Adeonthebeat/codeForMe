package studyForMe.Lecture06;

import java.util.Scanner;

public class Lecture04 {

    public int[] solution(int size, int n, int[] arr) {

        int[] cache = new int[size];

        for(int x : arr) {
            int pos = -1;

            for(int i = 0; i < size; i++) {
                // CACHE HIT 체크
                if(x == cache[i]) {
                    // 같은 값이 있다면 인덱스 저장.
                    pos = i;
                }
            }

            if(pos == -1) {
                // CACHE MISS
                for(int i = size - 1; i >= 1; i--) {
                    // 값을 전체적으로 오른쪽으로 당긴다.
                    cache[i] = cache[i-1];
                }
            } else {
                // CACHE HIT
                for(int i = pos; i >= 1; i--) {
                    //히트된 인덱스까지 값을 오른쪽으로 당긴다.
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x; // 가장 최근 값은 현재 작업으로 할당(첫번째 값)
        }

        return cache;
    }

    public static void main(String[] args) {
        Lecture04 main = new Lecture04();
        Scanner input = new Scanner(System.in);

        int size = input.nextInt(); // 5
        int n = input.nextInt(); // 9

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(size, n, arr)) {
            System.out.print(x + " ");
        }

    }
}
