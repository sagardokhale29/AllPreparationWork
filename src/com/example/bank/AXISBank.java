package com.example.bank;
public class AXISBank implements Bank {

	private final String bankName;
	public AXISBank(){
		this.bankName="Axis Bank";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}
