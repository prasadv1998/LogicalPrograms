package logicalprograms;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		int i, flag = 0;
		if (n == 0 || n == 1)
		{
			System.out.println(n+ " It is not a prime number");
		}else
		{
			for (i=2; i <=n/2; i++ )
			{
				if (n%1==0)
				{
					System.out.println(n+ " It is not a prime number");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0)
		{
			System.out.println(n+ " It is a prime number");
		}
	}
}