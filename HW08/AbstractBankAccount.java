package HW08;

public abstract  class AbstractBankAccount{
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

        public abstract void deposit(double amount);
        public abstract void withdraw(double amount);
        public abstract void transfer(double amount, AbstractBankAccount ba);

        public double getBalnace(){
            return this.balance;
        }

        protected void setBalance(double balance){
            this.balance = balance;
        }

        public String getAccountName(){
            return this.accountName;
        }

        private void setAccountName(String accountName){
            this.accountName = accountName;
        }

        public void showBalance(){
            System.out.printf("The balance in %s account is %g", this.getAccountName(), this.getBalnace());
            System.out.println();
        }
}