import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        int[] freq = new int[26];
        for (int j = 0; j < word.length(); j++) {
            freq[word.charAt(j) - 'a']++;
        }
        
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
    }
}