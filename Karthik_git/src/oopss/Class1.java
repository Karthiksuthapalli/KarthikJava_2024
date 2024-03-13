package oopss;

public class Class1  {
    int Stid;
    String Stname;
    double  salary;
    int sum;
    int k=33;

   

    public static void main(String[] args) {
        

        Class1 S1=new Class1();
         System.out.println(S1);
        
    }

    Class1(){
       // this(10);
       this(22);
        System.out.println("this is first constructor");

    }
    Class1(int k1){
        this("karthik");
        Stid=k1;
        System.out.println(Stid);
        System.out.println("this integer constructor");
    }
    Class1(String n1){
        //super();this()
       // this(55);
        Stname=n1;
        System.out.println(Stname);
        System.out.println("this is string constructor");

    }
    Class1(int k1,String S1,double sy){
        Stid=k1;
        Stname=S1;
        salary=sy;
        System.out.println("this is integer and string constructor");


    }
    void method1(){
        System.out.println("this is method1");

    }
    int method2(){
        System.out.println();
        return Stid;
    }
    int add(int num1,int num2){
        sum=num1+num2;
        return  sum;
    }
    int method3(int k){
        System.out.println("this is method 3");
        return 6;
    }


    
}
