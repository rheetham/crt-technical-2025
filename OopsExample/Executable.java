import java.io.BufferedReader;
import java.io.InputStreamReader;

class Executable {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BankAccount acc = new BankAccount("Dann", 10000.0, 1212);
        AtmOperations atmo = new AtmOperations(acc);

        System.out.println("Enter PIN");
        if (acc.getPin() != Integer.parseInt(br.readLine())) {
            System.out.println("Wrong PIN");
            return;
        }

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. exit");
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    atmo.checkBalance();
                    break;
                case 2:
                    atmo.deposit(500);
                    break;
                case 3:
                    atmo.withdraw(500);
                    break;
                case 4:
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}