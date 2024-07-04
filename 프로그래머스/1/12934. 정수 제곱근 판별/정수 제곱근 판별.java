class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long number = (long) Math.sqrt(n);
        if (Math.pow(number, 2) == n) {
            answer = (number + 1) * (number + 1);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}