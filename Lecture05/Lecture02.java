package studyForMe.Lecture05;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호문자제거
 */
public class Lecture02 {

    public String solution(String str) {
        String result = "";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == ')') {
                while(stack.pop() != '('); // '('전까지 제거.
            } else {
                stack.push(x);
            }
        }

        for(char x : stack) {
            result += x;
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture02 main = new Lecture02();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
