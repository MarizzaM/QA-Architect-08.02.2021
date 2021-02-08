package com.example;

import lombok.Getter;
import lombok.ToString;

@ToString
public class BankAccount {
    private double balance;
    private String account_number;
    private @Getter final String owner_name;

    public BankAccount(double balance, String account_number, String owner_name) {
        this.balance = balance;
        setAccountNumber(account_number);
        this.owner_name = owner_name;
    }

    public double getBalance(){
        return  balance;
    }

    public String getAccountNumber(){
        return  account_number;
    }

    public void setAccountNumber (String new_account_number){
        if (new_account_number.length() == 10){
            account_number = new_account_number;
        }
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw (double amount){
        balance -= amount;
    }
}
