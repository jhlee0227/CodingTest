import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int left = 0;
        int right = 0;
        String s = Integer.toString(N);
        String[] str = s.split("");

        for (int i = 0; i < s.length() / 2; i++) {
            left += Integer.parseInt(str[i]);
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            right += Integer.parseInt(str[i]);
        }

        if (left == right) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
