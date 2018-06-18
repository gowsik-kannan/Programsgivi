package guvi;

import java.util.Scanner;

public class Validate {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int number;
	do {
	    while (!sc.hasNextInt()) {
	        System.out.println("no");
	        sc.next();
	    }
	    number = sc.nextInt();
	} while (number <= 0);
	System.out.println("yes");

}
}
