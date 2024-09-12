package HW08;

public abstract class AbstractBankAccount{
        private String accountName = null;
        private double balance = 0.0;

        public AbstractBankAccount(){}
        public AbstractBankAccount(String accountName){
            this.setAccountName(accountName);
        }
        public AbstractBankAccount(String accountName, double amount){
            this.setAccountName(accountName);
            this.setBalance(amount);
        }

        protected abstract void deposit(double amount) throws Exception;
        protected abstract void withdraw(double amount) throws Exception;
        protected abstract void transfer(double amount, AbstractBankAccount ba) throws Exception;

        public double getBalnace(){
            return this.balance;
        }

        protected void setBalance(double balance){
            this.balance = balance;
        }

        public String getAccountName(){
            return this.accountName;
        }

        protected void setAccountName(String accountName){
            this.accountName = accountName;
        }

        public void showBalance(){
            System.out.printf("The balance in %s account is %g", this.getAccountName(), this.getBalnace());
            System.out.println();
        }

        @Override
        public String toString(){
            return "accountName: " + this.getAccountName() + ", balance: " + this.getBalnace();
        }
}