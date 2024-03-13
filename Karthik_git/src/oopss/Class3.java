package oopss;

public class Class3 { // we cannot make main classas private or protected beacuse jvm couldnt access
 //private class Class3

// public static final char[] q = null;
	// 
    int x;
    String st;
    double d;
    int z=55;
    //q;
    public static void main(String[] args) {
       // int z=77;
       int q=22;
    }


    Class3(){
        System.out.println("this is default constructor");
        
    }
    Class3(int x,String st,double d){
        x=x;
        st=st;
        d=d;
        System.out.println("this is integer constructor");
    }
    Class3(int x,String st){
        this.x=x;
        this.st=st;
    }
    void method1(){
        this.method2();
        System.out.println(x+" "+st+" "+d);
    }
   private void method2(){
        System.out.println("this is method 2");
        this.method3();//method3(); both are same 
    } 
    void method3(){
        System.out.println("this is method3");
    }
    int method4(){
        System.out.println("this int method");
        return 4;
    }
}

 class Karthik{  //default class
    int k=22;   //default datatype
    
    
    Karthik(){   // default constructor
        System.out.println("this karthik constructor");
    }
    

}

//private - we can acces only withih class
//default we can access only within package