class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int day = 0;
        for (int i = 1; i < a; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12:
                    day += 31;
                    continue;
                case 4, 6, 9, 11:
                    day += 30;
                    continue;
                case 2:
                    day += 29;
            }
        }
        day += b;
        int rest = (day + 4) % 7;
        switch (rest) {
            case 1:
                answer = "MON";
                break;
            case 2:
                answer = "TUE";
                break;
            case 3:
                answer = "WED";
                break;
            case 4:
                answer = "THU";
                break;
            case 5:
                answer = "FRI";
                break;
            case 6:
                answer = "SAT";
                break;
            default:
                answer = "SUN";
                break;
        }
        return answer;
    }
}