package guvi;

import java.util.Scanner;

public class Words {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String Sentence=sc.nextLine();
	int count=0;
	for(int i=0;i<Sentence.length();i++) {
		char ch=Sentence.charAt(i);
		if(ch==' ')
			count++;
	}
	System.out.println(count+1);
}
}
