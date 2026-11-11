package IITLaB;

import jdk.dynalink.NamedOperation;

class BankAccount {

    private String accountHolder;
    private double balance;
    String  accountNumber;


    BankAccount(String name, double initialAmount ,String accountNumber) {

        this.accountHolder =name;
        this.balance= initialAmount;
        this.accountNumber=accountNumber;

    }

    void deposit(double ammount){

        balance += ammount;
        System.out.println(accountHolder+" deposited :$"+ammount);

    }
    void withdraw( double ammount){
        if(balance>ammount) {
            balance -= ammount;
            System.out.println(accountHolder + " withdrawed :$" + ammount);
        }
        else
            System.out.println("withdraw amount exceeded");

    }
    void displayDetails() {

        System.out.println("Account Name :"+accountHolder);
        System.out.println("Current balance :$"+ balance);
        System.out.println("Account number :"+accountNumber);

    }

}