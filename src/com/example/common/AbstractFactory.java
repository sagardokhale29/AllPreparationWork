package com.example.common;

import com.example.bank.Bank;
import com.example.loan.Loan;

public abstract class AbstractFactory {
	
	  public abstract Bank getBank(String bank);  
	  public abstract Loan getLoan(String loan); 

}
