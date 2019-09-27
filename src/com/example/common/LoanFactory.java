package com.example.common;

import com.example.bank.Bank;
import com.example.loan.BusinessLoan;
import com.example.loan.EducatinalLoan;
import com.example.loan.HomeLoan;
import com.example.loan.Loan;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if(loan == null){  
	         return null;  
	      }  
	      if(loan.equalsIgnoreCase("Home")){  
	         return new HomeLoan();  
	      } else if(loan.equalsIgnoreCase("Business")){  
	         return new BusinessLoan();  
	      } else if(loan.equalsIgnoreCase("Education")){  
	         return new EducatinalLoan();  
	      }  
	      return null;  
	}

}
