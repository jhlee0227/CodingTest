class Solution {
    public String solution(String phone_number) {
        String replace = phone_number.substring(0, phone_number.length() - 4);
        String end = phone_number.substring(phone_number.length() - 4);

        replace = replace.replaceAll("[0-9]", "*");
        String answer = replace + end;
        
        return answer;
    }
}