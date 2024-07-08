import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            num[i] = T;
        }
        int i = 0;
        while (true) {
            if (num[i] < X) {
                break;
            }
            i++;
            X++;
            if (i >= N) {
                i = 0;
            }
        }
        System.out.println(i + 1);
    }
}
