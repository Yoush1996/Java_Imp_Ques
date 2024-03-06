package com.programs;

import java.util.Scanner;

public class Circle {
	
	public static void main(String[] args) {
		
		double r,dia,peri,area;
		System.out.println("Enter the radius: ");
		Scanner s = new Scanner(System.in);
		r = s.nextDouble();
		
		dia = 2*r ;
		peri = 2*Math.PI*r;
		area = Math.PI*r*r;
		
		System.out.printf("Diameter of circle is: %.2f\n",dia);
		System.out.printf("Perimeter of circle is: %.2f\n", peri);
		System.out.printf("Area of circle is: %.2f\n", area);
		
		
				
	}

}
