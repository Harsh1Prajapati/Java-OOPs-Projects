import java.util.Scanner;

class Atm {
    float Balance = 0.0f;
    int PIN = 1234;
    Scanner sc = new Scanner(System.in);

    public void checkpin() {
        System.out.println("Enter your PIN:");
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("Enter Your Choice:");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int opt = sc.nextInt();

            if (opt == 1) {
                checkBalance();
            } else if (opt == 2) {
                withdrawMoney();
            } else if (opt == 3) {
                depositMoney();
            } else if (opt == 4) {
                System.out.println("Thank you for using our ATM!");
                sc.close();
                return;
            } else {
                System.out.println("Enter a valid choice");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw:");
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance -= amount;
            System.out.println("Money Withdrawal Successful");
        }
    }

    public void depositMoney() {
        System.out.println("Enter the Amount:");
        float amount = sc.nextFloat();
        Balance += amount;
        System.out.println("Money Deposit Successful");
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.checkpin();
    }
}