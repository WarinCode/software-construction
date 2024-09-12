package Lab08;

public class TestBankAccount {
    public static void main(String []args){
        BankAccount a = new BankAccount("A", 1000);
        BankAccount b = new BankAccount("B", 1000);

        try {
            a.deposit(500);
            a.withdraw(200);
            a.showBalance();
            b.transfer(200, a);
            b.deposit(100);
            a.showBalance();
            b.showBalance();
        } catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
