package guvi;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr=new int[number];
		int temp=0;
		for(int i=0;i<number;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<number;i++) {
			for(int j=i+1;j<number;j++) {
				if(arr[i]<arr[j]) {
                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }}
				}
	        for (int i1 = 0; i1 < number; i1++) 

	        {

	            System.out.println(arr[i1]);

	        
			}
		}
}
