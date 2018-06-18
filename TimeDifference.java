package guvi;

import java.util.Scanner;

public class TimeDifference {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int hour1=sc.nextInt();
	int min1=sc.nextInt();
	System.out.println("\n");
	int hour2=sc.nextInt();
	int min2=sc.nextInt();
	int hour,min;
	hour=hour2-hour1;
	min=min1-min2;
	System.out.println(Math.abs(hour)+" "+Math.abs(min));
	
	
}
}
