package HW08;
import HW08.AbstractBankAccount;

public class BankAccount extends AbstractBankAccount {
    public BankAccount(){
        super();
    }

    public BankAccount(String accountName){
        super(accountName);
    }

    public BankAccount(String accountName, double amount){
        super(accountName, amount);
    }

    @Override
    public void deposit(double amount) {
        if(amount <= 0){
            System.out.println("Invalid amount!");
        } else {
            double result = this.getBalnace() + amount;
            this.setBalance(result);
//            System.out.println("Deposit successful.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0 || amount > this.getBalnace()){
            System.out.println("Invalid amount!");
        } else {
            double result = this.getBalnace() - amount;
            this.setBalance(result);
//            System.out.println("Withdraw successful.");
        }
    }

    @Override
    public void transfer(double money, AbstractBankAccount ba) {
        if (money <= 0 || money > this.getBalnace()) {
            System.out.println("Invalid money!");
        } else {
            this.withdraw(money);
            ba.deposit(money);
            System.out.printf("Transfer to account %s successful", ba.getAccountName());
            System.out.println();
        }
    }
}
