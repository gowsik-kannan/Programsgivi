package guvi;

import java.util.Scanner;

public class MaxArray {
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	int size = sc.nextInt();

	int[] arr = new int[size];
	
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	int max=arr[0];
for(int j=0;j<size;j++) {
	if(max<arr[j]) {
		
		max=arr[j];
	}
		
	}
	System.out.println(max);

	


}
}