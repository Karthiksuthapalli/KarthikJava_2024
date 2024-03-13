package Pack1;

public interface Interface1 {
    

   // it achievs 100% abstraction

    int i=20;     //---> complier by default it takes as public static final int i=20;
     
    public static final String st="Karthik";
    void method1();      //--->by default it is public abstract void method1                            // hiding implementation

    // Interface1(){           //  --> it cannot have constructors
                                 
    // }

    void display1();

    static void method4(){               // we cannot write final methods in inteerface because we cannot override
        System.out.println();
    }

    public static void main(String[] args) {

        
    }

}

 interface Interface2 {
    int i=40;

    void method2();

    public void display1();
    static void display2(){      //
      System.out.println(" this is static dispaly method in interface2");
    }




    
}

interface Interface3 extends Interface2{

    void show();
    
}
interface Interface4{
    void meth4();

    public static void main(String[] args) {
        Interface4 ob4=new Interface4() {              //unanimous way to access interface with in same class
            public void meth4(){
                System.out.println();
            }
        };
    }
}
interface Interface5{
    void absMethod();
}

interface Interface6{
    void inter1();
    void inter2();
}
interface Interface7 extends Interface6{
    void inter1();
}


class MyClass1 implements Interface1,Interface2{

    
   public  void method1(){
        System.out.println(" this is interface1 in my class");
    }
    public void method2(){
        System.out.println("this is method 2 in interface2");
    }
    public void display1(){
        System.out.println("this display1 method ");
    }
    static void method4(){

    }

    public static void main(String[] args) {
        MyClass1 ob1=new MyClass1();

        ob1.method1();
        System.out.println(Interface1.i+" "+ob1.st+" "+Interface2.i);

        Interface2.display2();
        ob1.method4();
    }

}

class MyClass2 extends MyClass1 implements Interface3{

    // public  void method1(){
    //              System.out.println(" this is interface1 in my class");
    //        }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

}
abstract class MyAbstract1 implements Interface5{
     abstract void myAb1Method();

     //abstract static void myab1met(); //-------------->doubt 

    

    //  void myAb1Method(){
    //     System.out.println();   // it says duplicate method
    //  }

}
class MyClass3 extends MyAbstract1{

    @Override
    public void absMethod() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'absMethod'");
    }

    @Override
    void myAb1Method() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'myAb1Method'");
    }

}


