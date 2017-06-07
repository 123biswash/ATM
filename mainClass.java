import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int pin1=0;
		int accNumber=0;
		char entryType;
		int counter=0;
		boolean x=false;
		ATM at = new ATM();
		Account a = new Account();
		double balance;
		double money;
		
		do{
		System.out.print("Enter your account number");
		accNumber= s.nextInt();
			
		System.out.print("Enter your PIN");
		pin1 = s.nextInt();
		
		x= at.validate(accNumber, pin1);
		counter++;
		}while(x ==false && counter<=3);
		
		if(x){
			
			System.out.print(" your account number is " + a.getAccNumber());
			System.out.print(" your name is " + a.getUserName());
			System.out.print(" your balance is " + a.getBalance());
			
		}else{
			System.out.print("You have exceeded maximum number of tries");
			return ;
		}

		do{
			System.out.print("Do you want to Deposit money or Withdraw money or check Balance(D/W/B)?");
			entryType= s.next(".").charAt(0);
		}while(entryType!='W' && entryType!='w'&&entryType!='B'&&entryType!='b'&&entryType!='D'&&entryType!='d');		
		
		if (entryType=='B' || entryType== 'b'){
			System.out.print(" your balance is " + a.getBalance());
		}else if(entryType=='W'||entryType=='w'){
			System.out.print("How much money do you want to withdraw?");
			money=s.nextInt();
			money= -money;
			balance = at.depositWithdrawal(money);  
			System.out.print( "your remaining balance is"+ balance);
		}else{
			System.out.print("How much money do you want to deposit?");
			money=s.nextInt();
			balance = at.depositWithdrawal(money);
			System.out.print("your remaining balance is "+ balance);
		}
		} 
	}
	
	


/*
The main method will simply call the ATM class and the  ATM class will  
interact with the user and with the Account class. There should be MINIMAL 
logic in the main method.
*/