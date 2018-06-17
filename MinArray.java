package guvi;

import java.util.Scanner;

public class MinArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr=new int[number];
		for(int i=0;i<number;i++) {
			arr[i]=sc.nextInt();
			
		}
		int min=arr[0];
		for(int i=0;i<number;i++) {
		
		if(min>arr[i]) {
			min=arr[i];
		}
		
		}
		System.out.println(min);
	}

}
