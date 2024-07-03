class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        int idx = 0;
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                idx = i;
                break;
            }
        }
        answer = "김서방은 " + idx + "에 있다";
        
        return answer;
    }
}