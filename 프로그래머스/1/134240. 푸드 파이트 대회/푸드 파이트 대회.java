import java.util.*;

class Solution {
    public String solution(int[] food) {
        Scanner sc = new Scanner(System.in);
        String answer = "";

        for (int i = 0; i < food.length; i++) {
            if (food[i] >= 1) {
                food[i] /= 2;
            }
        }
        for (int i = 1; i < food.length; i++) {
            for (int j = 1; j <= food[i]; j++) {
                answer += Integer.toString(i);
            }
        }
        answer += "0";
        for (int i = food.length - 1; i >= 1; i--) {
            for (int j = 1; j <= food[i]; j++) {
                answer += Integer.toString(i);
            }
        }
        return answer;
    }
}