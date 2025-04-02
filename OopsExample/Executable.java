import java.io.BufferedReader;
import java.io.InputStreamReader;

class Executable {
    public static void main(String[] args) throws Exception {
        BankAccount acc = new BankAccount("Dann", 10000.0, 1212);
        AtmOperations atmo = new AtmOperations(acc);
        atmo.checkBalance();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Amount to Deposit");
        double dAmt = Double.parseDouble(br.readLine());
        atmo.deposit(dAmt);

        atmo.checkBalance();

        System.out.println("Enter Amount to Withdraw");
        double wAmt = Double.parseDouble(br.readLine());
        atmo.withdraw(wAmt);

        atmo.checkBalance();
    }
}