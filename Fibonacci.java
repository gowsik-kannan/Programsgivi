package guvi;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number= sc.nextInt();
	int num1=0;
	int num2=1;
	int result;
	for(int i=1;i<number;i++) {
		result=num1+num2;
		System.out.println(result);
		num1=num2;
		num2=result;

	}
	
}
}
