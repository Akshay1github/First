package com.comp.client.multi;

public class Basic implements Runnable  {

	public void run() {
		
		for(int i =1; i<=10;i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Basic basic = new Basic();
		Thread thread = new Thread(basic);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Basic basic2 = new Basic();
		Thread thread2= new Thread(basic2);
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
