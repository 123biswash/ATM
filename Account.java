

public class Account {
	
	private int accNumber;
	private String userName;
	private double balance;
	private int pin;
	private double deposits;
	private double withdrawals;
	private int indexNum;
	private int[] acctNum;
	private int[] accountPin;
	private double[] accountBalance;
	
	
	public Account() {
		acctNum = new int[] {101,102,103,104,105};
		accountPin= new int[] {123, 124, 125, 126, 127};
		accountBalance= new double[] {1000, 1200, 1400, 1600, 1800};
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void detailsArray(int accountNum){
		
		for (int i = 0; i < accountNum.length; i++) {
		        if (array[i] == value) {
		            // Value found
		            return i;
		        }
		    }
		
		this.set(acctPin[i]);	
		this.setAccNumber(acctNum[i]);
	} 
	
	
	
		
}

/*
  Account class - contains the account number, user  
  name, balance,PIN.
  Deposits and withdrawals must update the balance.
 
  The screen should print out just like the ATMs you've used in real life.
  It should prompt you to enter an account number 
  (since we can't insert the card) and enter your PIN.
 
  The ATM class should validate the PIN and the Account Number. 
  If the user enters the incorrect PIN 
  three times the ATM should lock the user out so they can't 
  log in with the correct PIN on the fourth try. 
  Simply hardcode three account numbers and their PINs 
  and use if statements to ensure 
  the user has entered the correct PIN.
  Later we may move these to a database.
 
*/