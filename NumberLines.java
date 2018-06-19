package guvi;

import java.util.Scanner;

public class NumberLines {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String  sentence = sc.nextLine();
	String split[]=sentence.split("\\.");
	System.out.println((split.length)+1);

}
}
