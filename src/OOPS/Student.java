package OOPS;

import javax.sql.rowset.serial.SerialStruct;

public class Student {

        String name;
        private int roll;
        private double cgpa =3.8;

        final String uniName ="DU";       //  final -> THIS CANT BE CHANGED



        public double getcgpa(){

            return cgpa;

        }

        public double getRoll(){

            return roll;

        }

        public  void setRoll(int roll){

            this.roll=roll;  // otherwise compiled cant understand which roll is which
            // or  roll= any other named variable
        }

    }

