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
    public void deposit(double amount) throws Exception {
        if(amount <= 0){
            throw new Exception("Invalid amount!");
        }
        double result = this.getBalnace() + amount;
        this.setBalance(result);
//        System.out.println("Deposit successful.");
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if(amount <= 0 || amount > this.getBalnace()){
            throw new Exception("Invalid amount!");
        }
        double result = this.getBalnace() - amount;
        this.setBalance(result);
//        System.out.println("Withdraw successful.");
    }

    @Override
    public void transfer(double money, AbstractBankAccount ba) throws Exception {
        if (money <= 0 || money > this.getBalnace()) {
            throw new Exception("Invalid amount!");
        } else {
            this.withdraw(money);
            ba.deposit(money);
            System.out.printf("Transfer to account %s successful", ba.getAccountName());
            System.out.println();
        }
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
