package logicalprograms;
import java.util.Scanner;
public class FibanacciSeries {
	static int fibanacci(int n)
	{
		if (n<=1)
			return n;
		return fibanacci (n-1) + fibanacci (n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nummber: ");
		int N = sc.nextInt();
		for (int i=0; i<N; i++)
		{
			System.out.print(fibanacci(i)+ " ");
		}
		sc.close();
	}
}
