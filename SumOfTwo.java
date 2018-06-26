package guvi;

import java.util.Scanner;

public class SumOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(Math.addExact(n1, n2));
	}
}
