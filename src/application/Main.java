package application;

import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number: ");
        Integer number = sc.nextInt();
        System.out.println("Enter the account holder's name:  ");
        String holder = sc.next();
        System.out.println("Enter the withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();
        System.out.println("Is there an initial deposit? ");
        String initialDeposit = sc.next();
        double balance = 0.0;
        double amount;

        if (initialDeposit.equals("yes")){
        System.out.println("Enter the initial deposit: ");
        amount = sc.nextDouble();
        balance += amount;
        }

        Account account = new Account(number, holder, withdrawLimit, balance);
        System.out.println(account);

        System.out.println("Deposit: ");
        amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("Withdraw: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println();
        System.out.println("Last updated account data: ");
        System.out.println(account);
        
        sc.close();
    }
}