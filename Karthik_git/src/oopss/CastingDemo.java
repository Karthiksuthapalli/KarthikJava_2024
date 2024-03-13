package oopss;

class A {//extends java.lang.Object{
    String st="new ";
    void methodA(){
         int a=88;
        System.out.println("this is method in A");
    }
    static void methodAA(){
        System.out.println("method AA");

    }
    void disp(){
        System.out.println("this is disp");

    }
}

class B extends A{

    void methodA(){
        System.out.println(" this method  A in B");
    }
    static void methodBB(){
        System.out.println("this method in BB");
    }
    void methodB(){
        System.out.println("this is method in B");
    }
}



public class CastingDemo {
                                            //    1     2    4      8      4      8
    public static void main(String[] args) {   //byte->short->int->long->float->double

        //Type casting
        float ff=23.44f;   // converting float to integer 

        int i=(int) ff;

        System.out.println(i);
       // A obj=new A();       refernce type and memory are same
        
        A obj =new B(); 
         //or A obj =(A)new B();  //upcasting    B object is casted to A type
        obj.disp();
        obj.methodA(); //it calls ovverriden method
    //   obj.methodB();       // we cannot call methods in B Class, A class does not aware of class B

    //    // B obj1=new B();  // we can create a new object but 
        B obj1 = (B) obj;
        obj1.methodB();
    //  //  obj.methdoB();
      obj1.methodA();
  System.out.println(obj+" "+obj1);


    // B ob=new B();
    // ob.methodA();
    // ob.methodB();

    }
    
}
/*to follow object casting  order
 * first we follow inheritance 
 * upcasting -placing  subclass memory to superclass refernce variable or superclass refernce variable holding child class object
 * downcasting-*/

class Main{
    public static void main(String[] args) {
        B ob1=new B();
        ob1.methodA();
        ob1.methodB();
        ob1.methodAA();

    }
}