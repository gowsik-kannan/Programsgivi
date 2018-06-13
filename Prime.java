package guvi;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int m=number/2;
		int flag=0;
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
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println("yes");
			}
		}
		
	}
}
