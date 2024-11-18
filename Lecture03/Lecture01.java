package studyForMe.Lecture03;

import studyForMe.Lecture01.Lecture02;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture01 {

    public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB) {
        ArrayList<Integer> result = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m) {
            if(arrA[p1] < arrB[p2]) {
                result.add(arrA[p1++]);
            } else {
                result.add(arrB[p2++]);
            }
        }

        while(p1 < n) {
            result.add(arrA[p1++]);
        }

        while(p2 < m) {
            result.add(arrB[p2++]);
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture01 main = new Lecture01();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arrA = new int[n];

        for(int i = 0; i < n; i++) {
            arrA[i] = input.nextInt();
        }

        int m = input.nextInt();
        int[] arrB = new int[m];

        for(int i = 0; i < m; i++) {
            arrB[i] = input.nextInt();
        }

        for(int x : main.solution(n, arrA, m, arrB)) {
            System.out.print(x + " ");
        }

    }

}
