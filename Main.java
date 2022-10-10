# Banking-Management-System
#My first repository

import java.util.*;
import services.Display; 
import services.Deposit;
import services.Withdraw;
import services.Account;
import services.Balance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BANKING SYSTEM");
		System.out.println("Your Services: ");
		System.out.print("1.Open Account \n2.Deposit \n3.Withdraw \n4.Display \n5.Exit \n");
		
		Scanner sc = new Scanner(System.in);
		
		Deposit dep = new Deposit();
		Withdraw wit = new Withdraw();
		Display dis = new Display();
		Account acc = new Account();
		Balance bal = new Balance();

		char ch;
		do {
			System.out.print("Your choice: ");
			int x = sc.nextInt();
			
		switch (x) {
		
		case 1:
			acc.account();
			break;
		case 2:
			dep.deposit();
			break;
		case 3:
			wit.withdraw();
			break;
		case 4:
			dis.display();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Invalid Option");
		}
		
		System.out.println("\nWant to continue(Y/N): ");
		ch=sc.next().charAt(0);
		}while(ch=='Y');

	}

}
