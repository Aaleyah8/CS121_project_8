import java.uti;.*;
import java.io.*;



public class checkingAcount implements HasMenu, Serializable {
	double balance;
	
	public static void main(string[], args){
		checkingAcount = ca new checkingAcount;
	}

	public string menu(){
		system.out.println("0) quit")
		system.out.println("1) Check balance");
		system.out.println("2) Make a deposite");
		system.out.println("3) Make a withdrawal");
	} // end menu

	public void start(){
		boolean keepGoing = true;
		while(keepGoing){
			string response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				system.out.println("Checking balance...");
			} else if (response.equals("2")){
				system.out.println("Making a deposit...");
			} else if (response.equals("3")){
				system.out.println("Making a Withdrawal...");
		} // end if
	} // end while
} // end constructor

public void checkBalance(){
	system.outprintln("Current Balance: ");
} // end checkBalance

public string getBalanceString(){
	return balnce; 
} // end getBalanceString

public void setBalance(double balance){
	this.balance = balance;
	}

public void checkBalance(){
	}

private double getDouble(){
	scanner input = new scanner(system.in)
	return this.double;
	}
public void makeDeposit(){
	balance += balance;
}

public void makeWithdrawal {
	balance -= balance;
}

public interface HasMenu {
	string menu();
	void start();
	} // end interface
} // end class def

class SavingsAcount extends CheckingAcount {
	double interestRate;

	public static void main(string[], args){
		SavingsAcount = ca new SavingsAcount;
		} // end main
	public void calcInterest {
		double interestAmount = this.balance * this.interestRate;
		this.balance += interestAmount;
		system.out.println("New balance: " + getBalanceString());
	} // end calcinterest

	public void setInterestRate(){
		this.interestRate = interestRate;
	} // end setInterestRate

	public double getInterestRate(){
		return this.InterestRate;
	} // end getInterestRate
} // end class def

abstract class User implements HasMenu, Serializable {
	string userName = " ";
	string pin = " ";

	public boolean login(){
		system.out.println("User name: ");
		system.out.println("PIN: ");
	} // end login

	public boolean login(userName, PIN){
		string PIN;
		string userName;
		login = Username + PIN;	
	}

	public void setUserName(userName){
		this.userName = username;
	}

	public string getUserName(){
		return userName;
	}
	
	public void setPIN(PIN){
		this.PIN = PIN
	}

	public string getPIN(){
		return PIN;
	}

	public abstract string getReport(){
		Customer();
	}
} // end class def
	
class Customer extends User {
	CheckingAccount checking;
	SavingsAccount Savings;

	public static void main(string[], args){
		Customer = ca new Customer;
	} // end constructor

	public Customer(){
		system.out.println("Customer Menu");
	} // end constructor

	public Customer(userName, PIN){
		string userName;
		string PIN;
		Costumer = username + PIN;
	} // end constructor

	public void start(){
		boolean KeepGoing = true;
		while(keepGoing){
			string response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} if else (response.equals("1")){
				system.out.println("Checking Account");
			} if else (response.equals("2")){
			       system.out.println("Savings Account");
			} if else (response.equals("3"){
				system.out.println("Changing PIN...");
			} // end else
		} // end while
	} // end constructor

	void string menu(){
		system.out.println("0) Exit");
		system.out.println("1) Manage Checking Account");
		system.out.println("2) Manage Savings Account");
		system.out.println("3) Change PIN");
	} // end menu
	
	public void changePIN(){
		scanner = new scanner(system.in);
		this.PIN = changePIN;
	} // end constructor

	public string getReport(){
		start();
		Menu();
		getReport();
	} // end constructor
} // end class

	












