public class AtmOperations extends ATM {
    BankAccount ba;

    AtmOperations(BankAccount ba) {
        this.ba = ba;
    }

    @Override
    public void checkBalance() {
        System.out.println(ba.getName() + "'s account balance " + ba.getBalance());
    }

    @Override
    public void deposit(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid Amount");
            return;
        }
        double newBal = ba.getBalance() + amt;
        ba.setBalance(newBal);
    }

    @Override
    public void withdraw(double amt) {
        if (amt > ba.getBalance()) {
            System.out.println("broke boi");
            return;
        }
        double newBal = ba.getBalance() - amt;
        ba.setBalance(newBal);
    }

}