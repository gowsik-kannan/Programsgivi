package guvi;

import java.util.Scanner;

public class Largest 
{
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers");
	int a =  sc.nextInt();
	int b = sc.nextInt();
	int c= sc.nextInt();
	if(a<b && b>c) {
		System.out.println(b);
	}
	else if(a>b && a>c) {
		System.out.println(a);
		
		
	}
	else 
	{
		System.out.println(c);
	}
	
}
}
