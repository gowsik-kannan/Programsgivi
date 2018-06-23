package guvi;

import java.util.Scanner;

public class StingCmp {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String first= sc.next();
	String second=sc.next();
//	char [] firstArr=first.toCharArray();
//	char [] secondArr=first.toCharArray();
	if(first.length()>second.length()) {
		System.out.println(first);
	}
	else if(first.length()==second.length()) {
		System.out.println(first);
	}
	else {
		System.out.println(second);
	}
}
}
