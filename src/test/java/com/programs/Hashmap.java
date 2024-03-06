package com.programs;

public class Hashmap {

	public static void main(String[] args) {
		
		java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
		
		map.put("Youshva", 01);
		map.put("Dhanraj", 02);
		map.put("Emy", 03);
		map.put("Brother", 04);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
		
	}

}
