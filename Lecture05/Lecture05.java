package studyForMe.Lecture05;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기
 */
public class Lecture05 {

    public int solution(String str) {
        int result = 0;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {

            char x = str.charAt(i);

            // 여는 괄호라면
            if(x == '(') {
                stack.push(x);
            } else {
                // 닫는 괄호라면
                stack.pop();

                if(str.charAt(i-1) == '(') {
                    // 레이저라면.
                    result += stack.size();
                } else {
                    result += 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lecture05 main = new Lecture05();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
