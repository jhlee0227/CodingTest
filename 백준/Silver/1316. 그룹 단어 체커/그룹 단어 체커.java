import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean isGroupWord(String word) {
        boolean[] visit = new boolean[26];
        
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            // 이미 방문한적이 있는지 + 전 글자와 다른지 => 그룹단어가 아님
            if (visit[current - 'a'] && word.charAt(i - 1) != current) {
                return false;
            }
            visit[current - 'a'] = true;
        }
        
        return true;
    }
}