package guvi;

import java.util.Scanner;

public class ArrayIndex {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int size = sc.nextInt();
	int arr[]= new int [size];
	for(int i=0;i<size;i++) {
	 arr[i]=sc.nextInt();
	}
	for(int j=0;j<size;j++) {
		System.out.println(arr[j]+" "+j);
	}
}
}
