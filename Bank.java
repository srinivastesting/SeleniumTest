package com.abstractmethod.practise;

public abstract class Bank {
	public abstract void loan();

	public void credit() {
		System.out.println("credit method");
	}

	public void debit() {
		System.out.println("debit method");
	}

}
