package com.comp.client.second;

public class Methods {
	
	
	int global=10;
	static int var = 30;
	
	public void nonStat() {
		
		System.out.println("This is Non Static Method..");
	}
	
	public static void getDemo() {
		 
		Methods methods = new Methods();
		System.out.println("Global Variable in Static method :"+methods.global);
		methods.nonStat();
		System.out.println(var);
		var = 20;
		System.out.println("This is Static Method.."+var);
	}

	public static void main(String[] args) {
		
		Methods.getDemo();
	}

}
