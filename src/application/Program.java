package application;

import java.util.Locale;
import java.util.Scanner;

import Exceptions.ExceptionsAll;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		
	
		int number = sc.nextInt();
		System.out.println("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Saldo Inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe a quantia que deseja sacar: ");
		
		double amount = sc.nextDouble();
		
		try {
		acc.withdraw(amount);
		
		System.out.printf("Novo saldo: %.2f", acc.getBalance());
		}
		catch(ExceptionsAll e) {
			System.out.println(e.getMessage());
		}

		
	sc.close();	
	}

}
