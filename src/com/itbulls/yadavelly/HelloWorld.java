package com.itbulls.yadavelly;

public class HelloWorld {

	public static void main(String[] args) {
		
		Integer i1=127;
		Integer i2=127;
		System.out.println("i1==i2: "+(i1==i2)); // Because Integer pool -128 to 127
		
		Integer i3=128;
		Integer i4=128;
		System.out.println("i3==i4: "+(i3==i4));  //Because Integer pool out of range
		
	}

}
