package com.abstractmethod.practise;

public abstract class Bank {
	//loan method
	public abstract void loan();
        //credit method
	public void credit() {
		System.out.println("credit method");
	}
	//debit method

	public void debit() {
		System.out.println("debit method");
	}

}
