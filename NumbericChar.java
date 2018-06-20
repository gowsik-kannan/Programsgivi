package guvi;

import java.util.Scanner;

public class NumbericChar {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String sentence=sc.nextLine();
	 String numberOnly= sentence.replaceAll("[^0-9]", "");
	 int size=numberOnly.length();
	 System.out.println(size);
}
}
