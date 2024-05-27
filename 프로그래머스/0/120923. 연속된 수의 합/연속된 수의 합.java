class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int firstEven = total / num - (num / 2) + 1;
        int firstOdd = total / num - (num / 2);
        
        for (int i = 0; i < num; i++) {
            if (num % 2 == 0) {
                answer[i] = firstEven + i;
            } else {
                answer[i] = firstOdd + i;
            }
        }
        
        return answer;
    }
}