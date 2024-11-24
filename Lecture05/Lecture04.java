package studyForMe.Lecture05;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산(postfix)
 */
public class Lecture04 {

    public int solution(String str) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(x - 48); // 아스키코드 48 = '0'
            } else {

                int rt = stack.pop();
                int lt = stack.pop();

                if(x == '+') {
                    stack.push(lt + rt);
                } else if(x == '-') {
                    stack.push(lt - rt);
                } else if(x == '*') {
                    stack.push(lt * rt);
                } else if(x == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        result = stack.get(0);

        return result;
    }

    public static void main(String[] args) {
        Lecture04 main = new Lecture04();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
