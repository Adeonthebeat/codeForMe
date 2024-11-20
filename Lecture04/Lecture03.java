package studyForMe.Lecture04;

import java.util.*;

/**
 * 매출액종류
 */
public class Lecture03 {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> resultList = new ArrayList<>();

        Map<Integer, Integer> resultMap = new HashMap<>();
        for(int i = 0; i < k-1; i++) {
            resultMap.put(arr[i], resultMap.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for(int rt = k-1; rt < n; rt++) {
            resultMap.put(arr[rt], resultMap.getOrDefault(arr[rt], 0) + 1);
            resultList.add(resultMap.size());

            // 카운트를 세고 없으면 빼기.
            resultMap.put(arr[lt], resultMap.get(arr[lt]) - 1);
            if(resultMap.get(arr[lt]) == 0) {
                resultMap.remove(arr[lt]);
            }
            lt += 1;
        }

        return resultList;
    }

    public static void main(String[] args) {
        Lecture03 main = new Lecture03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, k, arr)){
            System.out.print(x + " ");
        }

    }

}
