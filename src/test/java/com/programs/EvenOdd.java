package com.programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	
		int x,y;
		try (Scanner s = new Scanner(System.in)) {
			x = s.nextInt();
			y = s.nextInt();
		}
		System.out.println("***********Even numbers between the range are*********");
		
		int count = x;
		while (count<=y)
		{
			
			if (count % 2 ==0) {
				System.out.println(count);
				
			}
			count ++;
			
		}
		
		

	}

}
