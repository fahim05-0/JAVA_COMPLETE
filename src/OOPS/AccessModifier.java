package OOPS;

public class AccessModifier {

    private int roll=10; // anywhere access able among all packages of a project

    private  double cgpa =3.85;  // within the class within its curly braces

    String name ="himal";// default  within same PACKAGE access able


    public int getRoll(){  // GETTER this is used to access any privet data  like am1.getRoll();

        return roll;

    }

    public void setRoll(int r){  //SETTER  can change privet data value

        roll=r;

    }


}
