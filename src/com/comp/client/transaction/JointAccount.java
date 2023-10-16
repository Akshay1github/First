package com.comp.client.transaction;

public class JointAccount {

private int balance = 5000;

public int getBalance() {
	
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}




public int withdraw(int amount) {
	
balance = balance - amount;
return balance;

}




}
