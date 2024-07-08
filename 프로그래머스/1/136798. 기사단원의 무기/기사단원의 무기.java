class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] num = new int[number];
        for (int i = 0; i < number; i++) {
            num[i] = i + 1;
        }
        int[] divisor = new int[number];
        divisor[0] = 1;
        for (int i = 1; i < divisor.length; i++) {
            for (int j = 1; j <= num[i] / 2; j++) {
                if (num[i] % j == 0) {
                    divisor[i]++;
                }

            }
            divisor[i]++;
        }
        for (int i = 1; i < divisor.length; i++) {
            if (divisor[i] > limit) {
                divisor[i] = power;
            }
        }
        for (int i = 0; i < divisor.length; i++) {
            answer += divisor[i];
        }
        return answer;
    }
}