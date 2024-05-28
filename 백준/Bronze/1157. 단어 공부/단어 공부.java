import java.util.*;

class Main {
    public static void main(String args[]) {
        // 단어 입력받기
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        // 대문자로 변경
        word = word.toUpperCase();
        // 한글자씩 쪼개기
        String[] wordArr = word.split("");
        // 알파벳 갯수를 저장할 배열
        int[] alpha = new int[26];
        int num = 0;
        for (int i = 0; i < wordArr.length; i++) {
            num = wordArr[i].charAt(0) - 'A';
            alpha[num]++;
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                ch = (char) (i + 65);
            } else if (alpha[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}