import java.util.Scanner;

public class ATM {
		
		 public static boolean validate(int accNum, int pin){
			 boolean b=false;
			 Account a = new Account();
			 int accNum2=a.getAccNumber();
			 int pin2=a.getPin();
			 if (accNum2==accNum){
				 if (pin2==pin){
					 b=true;
					 
				 }
			 }
			 return b;
		 }
		 
		 public static String userName(String userName)
		 {
			Account a = new Account();
			String username=a.getUserName();
			return username;
			 
		 }
		 
		public static double depositWithdrawal(double number){
			
			return number ;
		}
		 
		
		 
		 
}
		
		
/*
The ATM class will allow the user to make a deposit, make a withdraw 
or check the balance.The ATM class must also display the results of any transaction or inquiry.
 * 
 * The main method will simply call the ATM class and the  ATM class will  
 * interact with the user and with the Account class. T
 
*/
