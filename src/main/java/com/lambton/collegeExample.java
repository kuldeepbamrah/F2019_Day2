package com.lambton;

public class collegeExample {

    public static void main(String [] args)
    {


        Arithmetic a1= new Arithmetic();
        int a=20,b=5;
         System.out.println("*********Addition*******");
        System.out.println("Value of A :" +a);
        System.out.println("Value of  B:" +b);
         System.out.println("Addition  of a & b:" +a1.add(a,b) );

         System.out.println("*********Substraction*******");
        System.out.println("Value of A :"+a);
        System.out.println("Value of  B:"+b);
         System.out.println("Substraction of a & b :" + a1.substract(a,b));


         System.out.println("*********Division*******");
         System.out.println("Value of A :"+a);
         System.out.println("Value of  B:"+b);
         System.out.println("Division result of A and B:" + a1.division(a,b) );

        System.out.println("*********Multiplication*******");
        System.out.println("Value of A :"+a);
        System.out.println("Value of  B:"+b);
        System.out.println("Division result of A and B:" + a1.multiplication(a,b) );




        Student s= new Student();
        s.setFirstName("Kuldeep");
        s.setLastName("Singh");
        s.setMarks1(87);
        s.setMarks2(78);
        s.setMarks3(90);
        s.setMarks4(90);
        s.setMarks5(78);
        System.out.println(" First Name :" + s.getFirstName());
        System.out.println("Last Name: " + s.getLastName());
        System.out.println(" Marks for subject 1: " + s.getMarks1());
        System.out.println("Marks for subject 2 :" + s.getMarks2());
        System.out.println("Marks for subject 2 :" + s.getMarks3());
        System.out.println("Marks for subject 2 :" + s.getMarks4());
        System.out.println("Marks for subject 2 :" + s.getMarks5());


    }

}
