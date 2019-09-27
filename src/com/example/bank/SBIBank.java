package com.example.bank;
public class SBIBank  implements Bank{
	private final String bankName;
	public SBIBank(){
		this.bankName="SBI Bank";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}
