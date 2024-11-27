package studyForMe.Lecture05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 교육과정 설계
 */
public class Lecture07 {

    public String solution(String need, String plan) {
        String result = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(char x : need.toCharArray()) {
            Q.offer(x);
        }

        for(char x : plan.toCharArray()) {
            // 해당하는 것들만 체크 => 순서 체크
            // CBA -> CBxAxx(CBDAGE)
            if(Q.contains(x)) {
                if(x != Q.poll()) {
                    return "NO";
                }
            }
        }

        if(!Q.isEmpty()) {
            return "NO";
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture07 main = new Lecture07();
        Scanner input = new Scanner(System.in);

        String need = input.next();
        String plan = input.next();

        System.out.println(main.solution(need, plan));

    }

}
