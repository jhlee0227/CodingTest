import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double sum = 0.0;
		double result = 0.0;
		int creditSum = 0;

		for (int i = 0; i < N; i++) {
			String subject = sc.next();
			int credit = sc.nextInt();
			String grade = sc.next();

			switch (grade.charAt(0)) {
				case 'A':
					result = 4.0;
					break;
				case 'B':
					result = 3.0;
					break;
				case 'C':
					result = 2.0;
					break;
				case 'D':
					result = 1.0;
					break;
				default:
					result = 0.0;
			}
			if (grade.equals("F")) {
				result = 0.0;
			} else {
				if (grade.charAt(1) == '+') {
					result += 0.3;
				} else if (grade.charAt(1) == '-') {
					result -= 0.3;
				}
			}
			

			sum += result * credit;
			creditSum += credit;
		}
		System.out.printf("%.2f", sum / creditSum);


	}
}

