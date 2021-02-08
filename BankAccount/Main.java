package com.example;

public class Main {

    public static void main(String[] args) {
	    BankAccount ba = new BankAccount(15_000, "1234657890", "blabla" );

        ba.deposit(10_000);
        ba.withdraw(5_000);

        System.out.println(ba);
    }

}
