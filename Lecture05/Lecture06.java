package studyForMe.Lecture05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 공주구하기
 */
public class Lecture06 {

    public int solution(int n, int k) {
        int result = 0;

        Queue<Integer> Q = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            Q.offer(i);
        }

        while(!Q.isEmpty()) {
            for(int i = 1; i < k; i++) {
                Q.offer(Q.poll());
            }

            Q.poll();

            if(Q.size() == 1) {
                result = Q.poll();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture06 main = new Lecture06();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        System.out.println(main.solution(n, k));

    }

}
