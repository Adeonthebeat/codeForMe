package studyForMe.Lecture04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 학급회장(해쉬)
 */
public class Lecture01 {

    public char solution(int n, String str) {
        char result = 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = 0;
        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Lecture01 main = new Lecture01();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String str = input.next();

        System.out.println(main.solution(n, str));

    }

}
