package com.itbulls.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddIntegers {
	public static void main(String[] args) {
		
		String gmailPattern = "[a-zA-z\\d]+@gmail\\.com";

		Pattern p = Pattern.compile(gmailPattern);
		String sampleText= "Hi my name is varun and @ my email id is : varunyadavelly28@gmail.com, I am looking for full time roles in java";
		
		Matcher m = p.matcher(sampleText);
		m.find();
		
		System.out.println(m.group());
		
		
		
		}

}
