package com.programs;

public class StrRevEachWord {

	public static void main(String[] args) {
		String s = "Hai Tina Hai Akhshaya";
		
		String[] sp = s.split(" ");	// [ 0 = "Hai", 1 = "Tina", 2 = "Hai", 3 = "Akhshya"]
		
		String s1 = "";		
		
		for (String str : sp) {
			
			String s2 = "";
			
			for (int i = str.length()-1; i >= 0; i--) {
				char c = str.charAt(i);
				s2 = s2 + c;
			}
			
		s1 = s1 + s2 + " ";
		}
		
		System.out.println(s1.trim());
	}

}
