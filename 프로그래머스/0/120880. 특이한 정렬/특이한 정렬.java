class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] distance = new int[numlist.length];
        int[] idx = new int[numlist.length];
        for (int i = 0; i < idx.length; i++) {
            idx[i] = 0;
        }
        
        for (int i = 0; i < numlist.length; i++) {
            distance[i] = Math.abs(n - numlist[i]);
        }
        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance.length; j++) {
                if (distance[i] > distance[j]) {
                    idx[i]++;
                }
                if (distance[i] == distance[j]) {
                    if (numlist[i] < numlist[j]) {
                        idx[i]++;
                    }
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            answer[idx[i]] = numlist[i];
        }
        return answer;
    }
}