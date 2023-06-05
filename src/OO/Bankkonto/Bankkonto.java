package OO.Bankkonto;

public class Bankkonto {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    protected double withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

}
