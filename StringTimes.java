package guvi;

import java.util.Scanner;

public class StringTimes {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String name=sc.next();
	int times=sc.nextInt();
	for(int i=0;i<times;i++) {
		System.out.println(name);
	}
}
}
