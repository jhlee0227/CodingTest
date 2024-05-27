// 더 간단한 풀이
// 쿠폰 10장 -> 치킨 1마리. 즉, 10마리당 1마리는 공짜
// 그래서 9마리 주문하면 1마리 공짜로 얻는다고 계산
// 단 처음에는 10마리 주문해야 받을 수 있으므로
// 9로 나누어 떨어질 경우 한마리 빼야하고
// 0마리 시켜먹을 경우에도 조건에서 제외

class Solution {
    public int solution(int chicken) {
        int answer = chicken / 9;
        if (chicken > 1 && chicken % 9 == 0) {
          answer--;
        }
        return answer;
    }
}
