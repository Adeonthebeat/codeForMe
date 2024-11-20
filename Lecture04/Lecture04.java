package studyForMe.Lecture04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기
 */
public class Lecture04 {

    public int solution(String strA, String strB) {
        int result = 0;

        Map<Character, Integer> resultMapA = new HashMap<>();
        Map<Character, Integer> resultMapB = new HashMap<>();

        // 정답지
        for(char x : strB.toCharArray()) {
            resultMapB.put(x, resultMapB.getOrDefault(x, 0) + 1);
        }

        int cntB = strB.length() - 1;

        for(int i = 0; i < cntB; i++) {
            resultMapA.put(strA.charAt(i), resultMapA.getOrDefault(strA.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt = cntB; rt < strA.length(); rt++) {
            resultMapA.put(strA.charAt(rt), resultMapA.getOrDefault(strA.charAt(rt), 0) + 1);

            if(resultMapA.equals(resultMapB)){
                result += 1;
            }

            resultMapA.put(strA.charAt(lt), resultMapA.get(strA.charAt(lt)) - 1);
            if(resultMapA.get(strA.charAt(lt)) == 0) {
                resultMapA.remove(strA.charAt(lt));
            }

            lt += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture04 main = new Lecture04();
        Scanner input = new Scanner(System.in);

        String strA = input.next(); // 문제
        String strB = input.next(); // 정답

        System.out.println(main.solution(strA, strB));

    }

}
