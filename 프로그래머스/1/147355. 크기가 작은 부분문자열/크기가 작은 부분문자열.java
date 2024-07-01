class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] tNum = new String[t.length() - p.length() + 1];

        for (int i = 0; i < tNum.length; i++) {
            tNum[i] = t.substring(i, i + p.length());
        }

        for (int i = 0; i < tNum.length; i++) {
            if (Long.parseLong(tNum[i]) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}