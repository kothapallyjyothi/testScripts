package testscripts;


import java.util.ArrayList;
import java.util.Scanner;


public class WeekDays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		ArrayList<String>week=new ArrayList<>();
		week.add(sc.next());
//		week.add("mon");
//		week.add("tus");
//		week.add("wen");
//		week.add("tha");
//		week.add("fri");
//		week.add("sat");
//		week.add("sun");
		
		
		for (String string : week) {
			
			if (string.equals("sun")||string.equals("sat")) {
				System.out.println("weekend"+" "+string);
			}
			else {
				System.out.println("weekday"+" "+string);
			}
		}
	
	}

}
