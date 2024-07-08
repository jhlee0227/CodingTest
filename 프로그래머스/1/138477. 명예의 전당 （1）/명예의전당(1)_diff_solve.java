import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for (int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                // k + 1번째 요소가 들어오면 가장 작은 값 삭제
                priorityQueue.poll();
            }
            // 요소 삭제 안하고 값 가져옴
            answer[i] = priorityQueue.peek();
        }
        return answer;
    }
}
