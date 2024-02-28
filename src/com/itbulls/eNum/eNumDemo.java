package com.itbulls.eNum;

public class eNumDemo {
	public static void main(String[] args) {
		
		Priority priority = Priority.HIGH;
		
		switch(priority) {
		
		case HIGH:
			System.out.println("High");
			break;
		
		case MEDIUM:
			System.out.println("Medium");
			break;
			
		case LOW:
			System.out.println("Low");
			break;
		}
		
		
	Priority priority2 = Priority.valueOf("MEDIUM");
	System.out.println(priority2);
		
	
	System.out.println("No of days in January Month: "+ Month.JANUARY.getDaysAmount());
	
	
	
	
	}
}
