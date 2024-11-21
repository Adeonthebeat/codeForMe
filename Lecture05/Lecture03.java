package studyForMe.Lecture05;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑기(카카오)
 */
public class Lecture03 {

    public int solution(int n, int[][] board, int k, int[] moves) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for(int pos : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][pos-1] != 0) {
                    int temp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && temp == stack.peek()) {
                        result += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture03 main = new Lecture03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = input.nextInt();
            }
        }

        int k = input.nextInt();

        int[] moves = new int[k];

        for(int i = 0; i < k; i++) {
            moves[i] = input.nextInt();
        }

        System.out.println(main.solution(n, board, k, moves));

    }

}
