import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] integerArray = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            integerArray[i] = score[i]; // 자동 박싱
        }
        
        Arrays.sort(integerArray, Collections.reverseOrder());
        
        for (int i = m - 1; i <= integerArray.length - 1; i = i + m) {
            answer += integerArray[i] * m;
        }
        
        return answer;
    }
}