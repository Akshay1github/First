package com.comp.client.scanners;

import java.util.Scanner;

public class AddString {

	public String addText(String x, String y) {
		
		String Name = x+" "+y;
		return Name;
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String str1 = scanner.nextLine();
		
		System.out.println("Enter Last name: ");
		String str2 = scanner.nextLine();
		
		//System.out.println("Your have entered  : "+str1+" "+str2);
		
		AddString addString = new AddString();
		String Name = addString.addText(str1, str2);
		
		System.out.println("Your Full name is  : " +Name);
	}

}
