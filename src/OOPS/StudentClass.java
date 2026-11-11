package OOPS;

public class StudentClass {

    public  static  void fun(Student a){
        a.name="Shafin"; // will bw changed pass by reference

        System.out.println(a.name);

    }

    // class just like new data type


    static void main(String[] args) {
        int x=5;


        //                          WITHOUT CONSTRUCTOR

        Student s1 =new Student();

        s1.name="Fahim"; // direct access and update possible as PUBLIC

       // s1.roll=10;   //givies error as private no access no update


        s1.setRoll(24);  //  Setting value in PRIVATE with help of SETTER

        System.out.println(s1.getcgpa()); // access through GETTER of PRIVATE data

        System.out.println(s1.getRoll());
        System.out.println(s1.uniName);

        //                           WITH CONSTRUCTOR

        fun(s1);

        Car c1= new Car("Porshe","Sports",200000);

        System.out.println(c1.numOfCars);  // through object access

        System.out.println(c1.name);
        System.out.println(c1.price);
        Car c2=new Car("BMW" ,"Sports", 100000);

        System.out.println(Car.numOfCars);   // through class access


    }
}
