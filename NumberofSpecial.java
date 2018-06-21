package guvi;

import java.util.Scanner;

public class NumberofSpecial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence= sc.nextLine();
		for(int i=0;i<sentence.length();i++) {
			if(!Character.isDigit(sentence.charAt(i)) && (!Character.isAlphabetic(sentence.charAt(i)))&&(!Character.isWhitespace(sentence.charAt(i))))
					{
				System.out.print(sentence.charAt(i));
					}
		}
	}

}
