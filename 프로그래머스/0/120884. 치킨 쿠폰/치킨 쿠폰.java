class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        while (true) {
            coupon += chicken % 10;
            chicken /= 10;
            answer += chicken;
            if (chicken < 1) {
                break;
            }
        }
        answer += coupon / 10;
        // 마지막에 쿠폰이 10장 딱 맞춰지면 +1
        coupon += coupon / 10;
        // 쿠폰이 0일때 +1이 되는 경우를 방지하기 위해 coupon > 1의 조건을 더함
        if (coupon % 10 == 0 && coupon > 1) {
            answer++;
        }
        return answer;
    }
}
