package studyForMe.Lecture05;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기
 * https://ohsol.tistory.com/entry/%EB%B0%B1%EC%A4%80-10799%EB%B2%88-%EC%87%A0%EB%A7%89%EB%8C%80%EA%B8%B0-C-%ED%92%80%EC%9D%B4
 */
public class Lecture05 {

    public int solution(String str) {
        int result = 0;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if(x == '(') {
                // 여는 괄호라면.
                stack.push(x);
            } else {
                // 닫는 괄호라면.
                stack.pop();

                if(str.charAt(i-1) == '(') {
                    // 레이저라면.
                    result += stack.size();
                } else {
                    // 막대기 끝이라면.
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
