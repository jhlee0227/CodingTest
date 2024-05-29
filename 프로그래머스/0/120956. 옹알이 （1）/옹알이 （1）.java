class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bab = {"aya", "ye", "woo", "ma"};
        
        for (String str : babbling) {
            for (String b : bab) {
                // 순회하며 bab에 포함된 문자열이면 공백으로 치환
                str = str.replace(b, " ");
            }
            // 전부 순회한 후 공백 제거한 길이가 0이면 answer++
            if (str.trim().length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}