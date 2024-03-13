package oopss;

import oopss.NestedStatcClass.InStatic1.Deeper1;

public class NestedStatcClass {

    /*int i=88;
   static String ss="kk";
    
   void methodOut1(){
    System.out.println("this is outermethod");
   }

    static void methodout2(){
        System.out.println("this is static outer method");
    }*/

    
   
    
   static class InStatic1{
     //i=65;                      //we cannot acceess classes instance variables in static class
     
     int k=99;
      
     void methodInstat1(){
        System.out.println("this is inside static method1");
     }
     static void methodInsat2(){
        System.out.println("this is static method in inside of inststa class");

     }

     class Deeper1{
        int y=76;

        void methDeep(){
            System.out.println("this is method deep");
        }
        static void MethodDeep1(){
            System.out.println("this is static deeper");
        }
     }

   } 
   public static void main(String[] args) {
    NestedStatcClass ob1 =new NestedStatcClass();
   // ob1.methodOut1();
    NestedStatcClass.InStatic1.methodInsat2(); //accessing static method inside class with direct class names
    InStatic1 ob2=new InStatic1();
    ob2.methodInstat1();   // we dont need to create outside class reference
    NestedStatcClass.InStatic1.Deeper1.MethodDeep1();
    NestedStatcClass.InStatic1.Deeper1 ob3=new.Deeper1();



    
   }

}

