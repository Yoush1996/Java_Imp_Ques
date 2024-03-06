package com.programs;


public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "AMMA", s1 = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			s1=s1+c;
		}
		System.out.println("Reverse string is "+ s1);
		
		if (s.equals(s1)) {
			System.out.println("palindrome");
			
		} else {
			System.out.println("not palindrome");

		}
	}
	
}