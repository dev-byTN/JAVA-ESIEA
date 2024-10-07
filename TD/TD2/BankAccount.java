package TD.TD2;

public class BankAccount {

    public int balance;
    
    public BankAccount(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        if (amount < 0 ) System.out.println("Error");
        else balance += amount;
    }
    public void withdrawal(int amount) {
        if (amount < 0 || amount > balance) System.out.println("Error");
        else balance -= amount;
    }

    public static void main(String[] args) {
        	
        BankAccount ba = new BankAccount(50);
        ba.deposit(-50);
        System.out.println(ba.getBalance());
    }
    
}
