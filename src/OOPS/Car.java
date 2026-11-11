package OOPS;

public class  Car {
    String name;
    String type;
    int price;

    static  int numOfCars; // Shared data among the class


    public Car(String name, String type, int p) {

        this.name = name;
        this.type = type;
        price=p;
        numOfCars++;

    }
       // DEFAULT CONSTRUCTOR   add this to use both manual and construct input
    public Car(){

    }
}