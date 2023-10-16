package com.comp.client.transaction;

public class Transactions implements Runnable {

	JointAccount account = new JointAccount();
	
	@Override
	public void run() {
		for(int i =0; i<5;i++) {
			makeWithdrawal(500);
			if(account.getBalance()<=0) {
				System.out.println("your account is overdrawn...");
			}
			
		}
	}

	private void makeWithdrawal(int amt) {
		
		if(account.getBalance()>=amt) {
			System.out.println(Thread.currentThread().getName() 
					+"is Going to withdraw");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		int bal =account.withdraw(amt);	
		System.out.println(Thread.currentThread().getName()
				+"completed the withdraw & Your current balance is:    "+bal );
		
		}
		
	}
	
}
