package services;
import java.util.*;
import services.Account;
import services.Balance;

public class Display {
	
	public static void display() {
		Account acc = new Account();
		Balance bal = new Balance();
		System.out.println("Name: "+acc.name);
		System.out.println("Age: "+acc.age);
		System.out.println("Phone No: "+acc.phno);
		System.out.println("Aadhar: "+acc.Aadhar);
		System.out.println("Your current balance: "+bal.tot);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
	}

}
