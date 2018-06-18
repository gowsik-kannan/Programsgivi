package guvi;

import java.util.Scanner;

public class HoursMinutes {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int minutes=sc.nextInt();
	int min;
	int hour;
	if(minutes>=0) {
		hour=minutes/60;
		min=minutes%60;
		System.out.println(hour+ " "+min);
	}
}
}
