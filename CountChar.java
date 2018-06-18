package guvi;

import java.util.Scanner;

public class CountChar {
	public static void count(String str) {
		int length=str.length();
		int space=0;
		for(int i=0;i<length;i++) {
			char ch = str.charAt(i);
			if(ch==' ')
				space++;
		
		
		}
		int	result= length-space;
	System.out.println(result);

		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String word= sc.nextLine();
	CountChar.count(word);
	

	
	
}
}
