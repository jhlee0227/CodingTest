import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numA = new int[10];
        int[] numB = new int[10];
        for (int i = 0; i < 10; i++) {
            int A = sc.nextInt();
            numA[i] = A;
        }
        for (int i = 0; i < 10; i++) {
            int B = sc.nextInt();
            numB[i] = B;
        }
        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < 10; i++) {
            if (numA[i] > numB[i]) {
                scoreA += 3;
            } else if (numA[i] < numB[i]) {
                scoreB += 3;
            } else {
                scoreA += 1;
                scoreB += 1;
            }
        }
        System.out.println(scoreA + " " + scoreB);
        if (scoreA > scoreB) {
            System.out.println("A");
        } else if (scoreA < scoreB) {
            System.out.println("B");
        } else {
            boolean draw = true;
            for (int i = 9; i >= 0; i--) {
                if (numA[i] > numB[i]) {
                    System.out.println("A");
                    draw = false;
                    break;
                } else if (numA[i] < numB[i]) {
                    System.out.println("B");
                    draw = false;
                    break;
                }
            }
            if (draw) {
                System.out.println("D");
            }
        }
    }
}
