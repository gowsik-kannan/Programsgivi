package guvi;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int temp;
		int num2=sc.nextInt();
		if(num1!=num2) {
			temp=num1;
			num1=num2;
			num2=temp;
	
		}
		System.out.println(num1+" "+num2);
	}
}
