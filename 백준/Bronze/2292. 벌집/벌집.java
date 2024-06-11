import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1;
        int n = 0;
        while (true) {
            a += 6 * n;
            n++;
            if (N <= a) {
                break;
            }
        }
        System.out.println(n);
    }
}