package services;
import java.util.*;
import services.Balance;

public class Withdraw {
	
	public static void withdraw() {
		Scanner sc= new Scanner(System.in);
		Balance bal = new Balance();
		System.out.print("\nEnter amount: ");
		int b = sc.nextInt();
		bal.tot-=b;
		System.out.print("\nSuccessfully Withdrawed");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		withdraw();
	}

}
