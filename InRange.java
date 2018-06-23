package guvi;

import java.util.Scanner;

public class InRange {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int number= sc.nextInt();
	if(number>=1 && number<=10) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
