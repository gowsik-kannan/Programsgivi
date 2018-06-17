package guvi;

import java.util.Scanner;

public class BetweenAmstrong {


	    public static void main(String[] args) {

	       Scanner sc = new Scanner(System.in);
	    	int start = sc.nextInt();
			int end = sc.nextInt();
	        for(int number = start + 1; number < end; ++number) {
	            int digits = 0;
	            int result = 0;
	            int originalNumber = number;

	          
	            while (originalNumber != 0) {
	                originalNumber /= 10;
	                ++digits;
	            }

	            originalNumber = number;

	            while (originalNumber != 0) {
	                int remainder = originalNumber % 10;
	                result += Math.pow(remainder, digits);
	                originalNumber /= 10;
	            }

	            if (result == number)
	                System.out.print(number + " ");
	        }
	    }
	}

