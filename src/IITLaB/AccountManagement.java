package IITLaB;

public class AccountManagement {
    static void main(String[] args) {

        BankAccount user1 =new BankAccount("Fahim", 1000, "1824");
        BankAccount user2 =new BankAccount("Tanvir",1500 , "1810");

        user1.displayDetails();
        user2.displayDetails();

        user1.deposit(56);
        user1.displayDetails();

        user2.withdraw(100);
        user2.withdraw(2000);

        user2.displayDetails();

    }
}
