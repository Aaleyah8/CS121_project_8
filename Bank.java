import java.uti;.*;
import java.io.*;

public class checkingAcount implements HasMenu, Serializable {
	double balance;
	
	public static void main(string[], args){
		checkingAcount = ca new checkingAcount;
	}

	public string menu(){
		scanner input = scanner(system.in);
		system.out.println();
		system.out.println("Account Menu");
		system.out.println();
		system.out.println("0) quit")
		system.out.println("1) Check balance");
		system.out.println("2) Make a deposite");
		system.out.println("3) Make a withdrawal");
		system.out.println();
		string result = input.nextLine();
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
	this.balance = checkBalance();
	}

private double getDouble(){
	scanner input = new scanner(system.in);
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
		scanner input = new scanner(system.in);
		system.out.println();
		system.out.println("Customer Menu");
		system.out.println();
		system.out.println("0) Exit");
		system.out.println("1) Manage Checking Account");
		system.out.println("2) Manage Savings Account");
		system.out.println("3) Change PIN");
		system.out.println();
		system.out.println("Action: ");
		string result = input.nextLine();
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

public class Admin extends User implements HasMenu, Serializable {
		
	public void  Admin() {
		this.PIN = "0000";
		this.userName = "Admin";
	} // end Admin

	public static void main(string[], args){
		admin ca = new Admin();
	} // end main

	public void start(){
	}

	public string menu(){
		scanner input = new scanner(system.in);
		system.out.println();
		system.out.println("Admin Menu");
		system.out.println();
		system.out.println("0) Exit this menu");
		system.out.println("1) Full customer report");
		system.out.println("2) Add User");
		system.out.println("3) Apply interest to savings accounts");
		system.out.println();
		sytem.out.println("Action: ");
		string result = input.nextline();
	} // end menu

	public string getReport(){
		admin();
	} // end getReport
} // end class

public class Bank implements HasMenu{

	Admin admin = new Admin();
	customerList customers = new customerList();
	scanner input = new scanner(system.in);

	public static void main(string[], args){
		new Bank();
	} // end main

	public Bank(){
		this.loadCustumer();
		this.saveCustomer();
		this.start();
	} // end constructor

	public void loadSampleCustomers(){
		return.add(new Customer("Alice", "1111"));
		return.add(new Customer("Bob", "2222"));
		return.add(new customer("Cindy", "3333"));
	} // end constructor

	public void loadCustomers(){
		scanner input = new scanner(system.in);
		new customers();
	} // end constructor

	public void saveCustomers(){
		scanner input = new scanner(system.in);
	} // end constructor

	public void fullCustomerReport(){
		system.out.println("Full Customer report");
		system.out.println();
		system.out.println("user: ", "Checking: ", "Savings: ");
		this.customerList();
		string result = getReport();
	} // end constructor

	public void addUser(){
		system.out.println("Add User");
		system.out.println("Name: ");
		system.out.print("PIN: ");
	} // end constructor
	
	public void applyInterest(){
		system.out.println("Apply Interest");
		System.out.sprintln();
		system.out.println("New Balance");
		this.customerList();
		this.calcInterest();
	} // end constructor

	public void loginAsCustomer(){
		system.out.println("Your Name: ");
		string userNameln = input.nextLine();
		system.out.println("PIN: ");
		String plain = input.nextLine();

		customer currentCustomer = null;
		for (Customer customer: customers){
			if (customer.login(userNameln, plain)){
				currentCustomer = customer;
			} // end if
		} // end for
		
		if (currentCustomer = null){
			system.out.println("Customer not found");
		} else {
			currentCustomer.start();
		} // end else
	} // end constructor

	public void menu(){
		scanner input = new scanner(system.in);
		system.out.println();
		system.out.println("Bank Menu");
		system.out.println();
		system.out.println("0) Exit System");
		system.out.println("1) Login as Admin");
		system.out.println("2) Login as Customer");
		system.out.println();
		system.out.println("Action: ");
		string result = input.nextLine();
	} // end menu

	public void start(){
		boolean keepging = true;
		while(keepGoing){
			string response = menu();
			if (response.equals("1"){
				system.out.println("Admin Menu");
			} else if (response.equals("2"){
				system.out.println("Customer Menu");
			} else {
				boolean keepGoing = false;
			} // end else
		} // end while
	} // end constructor

	public void startAdmin(){
		string adminMenu;
	} // end constructor
	












