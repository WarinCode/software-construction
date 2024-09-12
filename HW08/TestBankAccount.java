package HW08;
import java.util.Scanner;
import HW08.BankAccount;

public class TestBankAccount {
    private static Scanner sc = new Scanner(System.in);
    private static void deposite(BankAccount account) throws Exception {
        System.out.printf("Enter the amount to deposit into the account %s:", account.getAccountName());
        account.deposit(sc.nextDouble());
        account.showBalance();
    }

    private static void withdraw(BankAccount account) throws Exception {
        System.out.printf("Enter the amount to withdraw from the account %s:", account.getAccountName());
        account.withdraw(sc.nextDouble());
        account.showBalance();
    }

    private static void transfer(BankAccount fromAccount, BankAccount toAccount) throws Exception {
        System.out.printf("Transfer money from account %s to account %s", fromAccount.getAccountName(), toAccount.getAccountName());
        System.out.print("\nEnter amount:");
        fromAccount.transfer(sc.nextDouble(), toAccount);
        fromAccount.showBalance();
        toAccount.showBalance();
    }

    public static void main(String []args){
        BankAccount accountA = new BankAccount("A", 1000);
        BankAccount accountB = new BankAccount("B", 1000);

        try {
            TestBankAccount.deposite(accountA);
            TestBankAccount.withdraw(accountA);
            System.out.println();

            TestBankAccount.deposite(accountB);
            TestBankAccount.withdraw(accountB);
            System.out.println();

            TestBankAccount.transfer(accountA, accountB);
            System.out.println();
            TestBankAccount.transfer(accountB, accountA);
        } catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
