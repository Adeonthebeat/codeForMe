package studyForMe.Lecture02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 */
public class Lecture01 {


    public List<Integer> solution(int[] array) {
        List<Integer> result = new ArrayList<Integer>();

        result.add(0, array[0]);

        for(int i = 1; i < array.length; i++) {
            if(array[i-1] < array[i]) {
                result.add(array[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture01 T = new Lecture01();
        Scanner input = new Scanner(System.in);

        int cnt = input.nextInt();
        int[] array = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            array[i] = input.nextInt();
        }

        List<Integer> resultList = T.solution(array);

        for(Integer x: resultList) {
            System.out.print(x + " ");
        }

    }

}
