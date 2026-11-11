package IITLaB;

class LibraryIDCard {

    String studentName;
    String studentId;
    double currentPrintBalance;

    LibraryIDCard (String  name , String id , double currentBalance){

        this.studentName =name;
        this.studentId= id;
        this.currentPrintBalance=currentBalance;

    }

    void topUp (double amount){

        currentPrintBalance+=amount;
        System.out.println("New printing balance after topup :"+currentPrintBalance);

    }
    void reducePrintBalance(double amount){
        currentPrintBalance-=amount;
        System.out.println("New printing balance after print :"+currentPrintBalance);

    }
    void displayCard(){

        System.out.println("Name : "+studentName);
        System.out.println("ID : "+studentId);
        System.out.printf("Print Balance : " +currentPrintBalance);

    }



}
