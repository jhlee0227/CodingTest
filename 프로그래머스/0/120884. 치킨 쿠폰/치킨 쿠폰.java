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
        coupon += coupon / 10;
        if (coupon % 10 == 0 && coupon > 1) {
            answer++;
        }
        return answer;
    }
}