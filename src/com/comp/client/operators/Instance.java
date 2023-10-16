package com.comp.client.operators;

public class Instance extends Throwable {

	public static void main(String[] args) {
	
		String str = "Akki";
		boolean result;
		
		Instance instance = new Instance();
		
		result =  str instanceof String;
		
		System.out.println(result);
		
		

	}

}
