package com.comp.client.transaction;

public class Result {

	public static void main(String[] args) {
		
		Transactions transactions = new Transactions();
		
		Thread thread1 = new Thread(transactions);
		Thread thread2 = new Thread(transactions);
		thread1.setName("Akshay");
		thread2.setName("Ronit");
		thread1.start();
		thread2.start();
	}

}
