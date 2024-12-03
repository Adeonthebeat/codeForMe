package studyForMe.Lecture05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 응급실
 */
class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class Lecture08 {

    public int solution(int n, int k, int[] arr) {
        int result = 0;

        Queue<Person> Q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }

        while(!Q.isEmpty()) {
            Person temp = Q.poll();
            for(Person x : Q) {
                // 위험도가 상대적으로 낮다면, 다시 큐 안으로
                if(x.priority > temp.priority) {
                    Q.offer(temp);
                    temp = null;
                    break;
                }
            }

            // 가장 위험도가 높다면.
            if(temp != null) {
                result += 1;
                if(temp.id == k) {
                    return result;
                }
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
