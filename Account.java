package services;
import java.util.*;

public class Account {
	static String name="",age="",Aadhar="",phno="";
	public static void account() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name += sc.nextLine();
		System.out.println("Enter age: ");
		age += sc.nextLine();
		System.out.println("Enter phone no: ");
		phno += sc.nextLine();
		System.out.println("Enter Aadhar: ");
		Aadhar += sc.nextLine();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account();
	}

}
