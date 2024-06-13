import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int[] on = new int[N];
		int[] check = new int[N];
		int answer = 0;

		for (int i = 0; i < M; i++) {
			int num = sc.nextInt();
			on[num]++;
		}
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < N; j++) {
				if (j == 0 && on[j] == 1) {
					check[N - 1]++;
					check[1]++;
				} else if (j == N - 1 && on[j] == 1) {
					check[0]++;
					check[N - 2]++;
				} else if (on[j] == 1){
					check[j + 1]++;
					check[j - 1]++;
				}
			}
			for (int j = 0; j < N; j++) {
				if (check[j] == 1) {
					on[j] = 1;
				} else {
					on[j] = 0;
				}
			}
			for (int j = 0; j < N; j++) {
				check[j] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			if (on[i] == 1) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}

