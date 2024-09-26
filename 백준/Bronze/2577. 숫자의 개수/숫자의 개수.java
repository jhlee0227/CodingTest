import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int[] arr = new int[10];
        
        int total = A * B * C;
        
        while (total > 0) {
            arr[total % 10]++;
            total /= 10;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}