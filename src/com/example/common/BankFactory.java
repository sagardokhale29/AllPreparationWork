package com.example.common;

import com.example.bank.AXISBank;
import com.example.bank.Bank;
import com.example.bank.HDFCBank;
import com.example.bank.SBIBank;
import com.example.loan.Loan;

public class BankFactory extends AbstractFactory {

	 public Bank getBank(String bank){  
	      if(bank == null){  
	         return null;  
	      }  
	      if(bank.equalsIgnoreCase("HDFC")){  
	         return new HDFCBank();  
	      } else if(bank.equalsIgnoreCase("AXIS")){  
	         return new AXISBank();  
	      } else if(bank.equalsIgnoreCase("SBI")){  
	         return new SBIBank();  
	      }  
	      return null;  
	   }  
	  public Loan getLoan(String loan) {  
	      return null;  
	   }  

}
