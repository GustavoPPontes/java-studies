package session01;

public class Main {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("0001-1", "Ana Paula", 1500.00);
        BankAccount account2 = new BankAccount("0002-7", "Carlos Silva", 320.50);

        account1.displayData();
        System.out.println();
        account2.displayData();

    }
}
