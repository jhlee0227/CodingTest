import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int H = sc.nextInt();
		int[] score = new int[N];
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}
		// 오름차순 정렬
		Arrays.sort(score);
		// 낮은 순 L개 높은순 H개 빼기
		for (int i = L; i < N - H; i++) {
			sum += score[i];
		}
		avg = (double) sum / (N - H -  L);
		System.out.println(avg);
	}
}

