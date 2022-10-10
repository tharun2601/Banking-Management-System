package services;
import java.util.*;
import services.Balance;

public class Deposit {
	
	public static void deposit() {
		
		Scanner sc = new Scanner(System.in);
		Balance bal = new Balance();
		System.out.print("Enter amount: ");
		int a = sc.nextInt();
		
		bal.tot+=a;
		System.out.print("Successfully Deposited");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		deposit();
	
	}

}
