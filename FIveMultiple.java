package guvi;

import java.util.Scanner;

public class FIveMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int multi;
		for(int i=1;i<=5;i++) {
			multi=i*number;
			System.out.print(" "+multi);
		}
	}
}
