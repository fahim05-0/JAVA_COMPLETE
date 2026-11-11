package IITLaB;

public class LibraryManagement {
    static void main(String[] args) {

        LibraryIDCard user1 = new LibraryIDCard("Fahim ", "1824" ,100);

        user1.topUp(20);
        user1.reducePrintBalance(10);

        user1.displayCard();

    }
}
