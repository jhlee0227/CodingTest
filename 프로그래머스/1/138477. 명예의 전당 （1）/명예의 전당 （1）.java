import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int min = score[0];
        for (int i = 0; i < answer.length; i++) {
            if (i < k) {
                if (min < score[i]) {
                    answer[i] = min;
                } else {
                    min = score[i];
                    answer[i] = score[i];
                }
            } else {
                Integer[] temp = new Integer[i + 1];
                for (int j = 0; j < i; j++) {
                    temp[j] = score[j];
                }
                temp[i] = score[i];
                Arrays.sort(temp, Collections.reverseOrder());
                answer[i] = temp[k - 1];
            }
        }
        return answer;
    }
}