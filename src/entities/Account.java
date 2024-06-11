package entities;

public class Account {

    Integer number;
    String holder;
    Double balance;
    Double withdrawLimit;

    public Account(Integer number, String holder, Double withdrawLimit, Double balance) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (withdrawLimit > amount && balance > amount) {
        balance -= amount;
        } else if (balance < amount) {
            System.out.println("Your balance value is lower than the withdraw value, withdraw failed!");
        } else if (withdrawLimit < amount) {
            System.out.println("Your withdraw limit is lower than the withdraw value, withdraw failed!");
        }
    }

    @Override
    public String toString() {
        return "Account number: "
                + number
                + "\nHolder: "
                + holder
                + "\nWithdraw Limit: $"
                + withdrawLimit
                + "\nBalance: $"
                + balance;
    }
}