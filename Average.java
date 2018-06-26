package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] numbers= new int[size];
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		sc.close();
		int sum=Arrays.stream(numbers).sum();
	//System.out.println(Arrays.toString(numbers));
	System.out.println(sum/size);
	}

}
