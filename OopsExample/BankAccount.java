public class BankAccount {
    private String name;
    private double balance;
    private int pin;

    BankAccount(String name, double balance, int pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}