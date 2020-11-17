package com.abstractmethod.practise;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank hdfc=new HDFCBank();
		hdfc.credit();
		hdfc.debit();
		hdfc.loan();
		hdfc.educationLoan();
		System.out.println("******************");
		Bank b=new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		

	}

}
