package Lab08;

public class BankAccount extends AbstractBankAccount {
    public BankAccount(){
        super();
    }
    public BankAccount(String accountName){
        super(accountName);
    }
    public BankAccount(double amount) {
        super(amount);
    }
    public BankAccount(String accountName, double amount){
        super(accountName, amount);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void deposit(double amount) throws Exception {
        if(amount <= 0){
            throw new Exception("Invalid amount!");
        }
        double result = this.getBalnace() + amount;
        this.setBalance(result);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if(amount <= 0 || amount > this.getBalnace()){
            throw new Exception("Invalid amount!");
        }
        double result = this.getBalnace() - amount;
        this.setBalance(result);
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
}
