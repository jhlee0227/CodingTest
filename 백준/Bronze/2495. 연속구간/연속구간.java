import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int result = 1;
            int max = 1;

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    result++;
                } else {
                    max = Math.max(max, result);
                    result = 1;
                }
            }
            max = Math.max(max, result);
            System.out.println(max);
        }
        
    }
}