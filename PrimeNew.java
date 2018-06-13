package guvi;

import java.util.Scanner;

public class PrimeNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int m=number/2;
		int count=0;
		if(number == 1 || number ==0)
		{
			System.out.println("yes");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(number % i==0)
				{
					System.out.println("no");
					count=1;
					break;
				}
				
			}
			if(count==0)
			{
				System.out.println("yes");
			}
		}
		
	}
}
