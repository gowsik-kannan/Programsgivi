package guvi;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	int ones,a=0;
	int number=num;
	while(number>0) {
		ones=number%10;
		a=a*10 + ones;
		number=number/10;
		
	}
	if(num==a)
		System.out.println("yes");
	else
		System.out.println("no");
	}}