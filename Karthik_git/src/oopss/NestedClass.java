package oopss;

public class NestedClass {        // starting class should be public or abstract or final

    int i=80;
    int j;

    void outerMethod(){
        System.out.println("outer method"+j);
    }

    abstract class Inabstract{
         abstract void methodAb1();
    
    void methodab(){
        System.out.println("this is methodab in abstarct");
    }
    }

    private class InnerClass1{
       private String st;
        int k=88;

        void innerMethod1(){
            System.out.println("Innermethod1"+i+" "+j+" "+st);
        }
        static void innerMethod2(){
            System.out.println("static innermethod2");
        }
        class InnerClass2{



            int in2=90;

            void inInnerMethod3(){
                System.out.println("this is inInner method3"+k+" "+st);
            }

            static void inInnermethod4(){
                System.out.println("this is inInnermethod4");
            }
        }
    }

    // InnerClass1 obIn1=new InnerClass1();      // we cannot  access here
    // obIn1.innerMethod1();
     NestedClass(){
        System.out.println("this is nested class constructor");
     }
    
    
    
    


    public static void main(String[] args) {
        NestedClass obOuter=new NestedClass();
        NestedClass.InnerClass1 obIn1=obOuter.new InnerClass1();
        //obIn1.outerMethod(); we cannot  access outside innerclass properties  with inner object 
        // if you want acccess out side you have to use outside object
        System.out.println(obOuter.i+" "+obOuter.j);
        obIn1.innerMethod1();
        NestedClass.InnerClass1.innerMethod2(); // accessing static method

        NestedClass.InnerClass1.InnerClass2 obInner2=obIn1.new InnerClass2();
        obInner2.inInnerMethod3();
        NestedClass.InnerClass1.InnerClass2.inInnermethod4();

       // accessing innerabstract class
       NestedClass.Inabstract obinab=obOuter.new Inabstract() {

        @Override
        void methodAb1() {                                        //unanimous way
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'methodAb1'");
        }
        
       };

        
    }
    
}   
// classes and interfaces in one place to be more readable and maintainable.
//code optimization
class outer1{
    int lang;

    private class inner1{
        void k1(){
            System.out.println("i am private");

        }
    }    
        public void accessk1(){
            inner1 inner = new inner1();
        inner.k1();
        }
    
}
 class Main {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.accessK1();
        
    }
}