package alexlin7.nutc.unit9;

import java.util.*;

class Account implements Comparable<Account> {
	private String name;
	private String number;
	private int balance;

	Account(String name, String number, int balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("Account(%s, %s, %d)", name, number, balance);
	}

	@Override
	public int compareTo(Account other) {
		return this.balance - other.balance;
	}

}

public class Sort {

	public static void main(String[] args) {
		var accounts = Arrays.asList(
				new Account("Justin", "X1234", 1000), 
				new Account("Monica", "X5678", 500),
				new Account("Irene", "X2468", 200));
		Collections.sort(accounts);
		System.out.println(accounts);

	}

}
