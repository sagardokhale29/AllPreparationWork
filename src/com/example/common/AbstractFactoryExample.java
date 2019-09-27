package com.example.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.bank.Bank;
import com.example.loan.Loan;

public class AbstractFactoryExample {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter bank name");
		String name=br.readLine();
		AbstractFactory bankFactory=FactoryCreator.getFactory("BANK");
		Bank b=bankFactory.getBank(name);
		System.out.print("\n");  
		System.out.print("Enter the interest rate for "+b.getBankName()+ ": ");  
		double rate=Double.parseDouble(br.readLine());
		System.out.print("\n");  
		System.out.print("Enter the loan amount you want to take: ");  
		  
		double loanAmount=Double.parseDouble(br.readLine());  
		System.out.print("\n");  
		System.out.print("Enter the number of years to pay your entire loan amount: ");  
		int years=Integer.parseInt(br.readLine());  
		System.out.print("\n");  
		System.out.println("you are taking the loan from "+ b.getBankName());  
		
		System.out.print("\n");  
		System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");  
		  
		String loanName=br.readLine();  
		  
		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
		           Loan l=loanFactory.getLoan(loanName);  
		           l.getInterestRate(rate);  
		           l.calculateLoanPament(loanAmount,years);  
		
	}

}
