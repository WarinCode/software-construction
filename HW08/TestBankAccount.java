package HW08;
import java.util.Scanner;
import HW08.BankAccount;

public class TestBankAccount {
    public static Scanner ssc = new Scanner(System.in);
    public static void testDeposit(BankAccount account){
        System.out.printf("Enter the amount to deposit into the account %s:", account.getAccountName());
        account.deposit(ssc.nextDouble());
        account.showBalance();
    }

    public static void testWithdraw(BankAccount account){
        System.out.printf("Enter the amount to withdraw from the account %s:", account.getAccountName());
        account.withdraw(ssc.nextDouble());
        account.showBalance();
    }

    public static void testTransfer(BankAccount fromAccount, BankAccount toAccount){
        System.out.printf("Transfer money from account %s to account %s", fromAccount.getAccountName(), toAccount.getAccountName());
        System.out.print("\nEnter amount:");
        fromAccount.transfer(ssc.nextDouble(), toAccount);
        fromAccount.showBalance();
        toAccount.showBalance();
    }

    public static void main(String []args){
        BankAccount accountA = new BankAccount("A", 1000);
        BankAccount accountB = new BankAccount("B", 1000);
        Scanner sc = new Scanner(System.in);

        TestBankAccount.testDeposit(accountA);
        TestBankAccount.testWithdraw(accountA);
        System.out.println();

        TestBankAccount.testDeposit(accountB);
        TestBankAccount.testWithdraw(accountB);
        System.out.println();

        TestBankAccount.testTransfer(accountA, accountB);
        System.out.println();
        TestBankAccount.testTransfer(accountB, accountA);

//        System.out.printf("Enter the amount to deposit into the account %s:", accountA.getAccountName());
//        accountA.deposit(sc.nextDouble());
//        accountA.showBalance();
//        System.out.printf("Enter the amount to withdraw from the account %s:", accountA.getAccountName());
//        accountA.withdraw(sc.nextDouble());
//        accountA.showBalance();
//
//        System.out.println();
//
//        System.out.printf("Enter the amount to deposit into the account %s:", accountB.getAccountName());
//        accountB.deposit(sc.nextDouble());
//        accountB.showBalance();
//        System.out.printf("Enter the amount to withdraw from the account %s:", accountB.getAccountName());
//        accountB.withdraw(sc.nextDouble());
//        accountB.showBalance();
//
//        System.out.printf("Transfer money from account %s to account %s", accountA.getAccountName(), accountB.getAccountName());
//        System.out.print("\nEnter amount:");
//        accountA.transfer(sc.nextDouble(), accountB);
//        accountA.showBalance();
//        accountB.showBalance();
//
//        System.out.println();
//
//        System.out.printf("Transfer money from account %s to account %s", accountB.getAccountName(), accountA.getAccountName());
//        System.out.print("\nEnter amount:");
//        accountB.transfer(sc.nextDouble(), accountA);
//        accountB.showBalance();
//        accountA.showBalance();
    }
}
