package studyForMe.Lecture04;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * 아나그램(해쉬)
 */
public class Lecture02 {

    public String solution(String strA, String strB) {
        String result = "NO";

        Map<Character, Integer> mapA = new HashMap<>();

        for(char x : strA.toCharArray()) {
            mapA.put(x, mapA.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> mapB = new HashMap<>();

        for(char x : strB.toCharArray()) {
            mapB.put(x, mapB.getOrDefault(x, 0) + 1);
        }

        int cnt = 0;

        for(char A : mapA.keySet()) {
            for(char B : mapB.keySet()) {
                if(A == B) {
                    if(Objects.equals(mapA.get(A), mapB.get(B))) {
                        cnt += 1;
                    }
                }
            }
        }

        if(cnt == mapA.size()) {
            result = "YES";
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture02 main = new Lecture02();
        Scanner input = new Scanner(System.in);

        String strA = input.next();
        String strB = input.next();

        System.out.println(main.solution(strA, strB));

    }

}
