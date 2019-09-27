package com.example.bank;
public class HDFCBank implements Bank {
	private final String bankName;
	public HDFCBank(){
		this.bankName="HDFC Bank";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}
