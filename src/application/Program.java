package application;

import java.util.Locale;
import java.util.Scanner;
import model.Exceptions.AccountExceptions;
import model.entities.accont;


public class Program {

	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();	
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();		
			accont accont = new accont(number, holder, balance, withdrawLimit);		
			accont.withdraw(amount);		
			System.out.printf("New balance: %.2f" , accont.getBalance());
		}
		catch (AccountExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("error inesperado");
		}	
		
		sc.close();
		
		
	}

}
