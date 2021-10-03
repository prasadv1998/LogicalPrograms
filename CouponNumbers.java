package logicalprograms;

import java.util.Scanner;

public class CouponNumbers {
	public static int getRandom(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = getRandom(n);
			System.out.println("The Random number is :" + value);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int N = sc.nextInt();
		System.out.println("The Number of Times random perforformed for getting " + N + " Distinct Random Numbers is :"
				+ collect(N));
		sc.close();
	}

}
