package oopss;

public class NestedMethodClass {
    int i=45;
    String st="karthik";
    int m;
    void nesMetClass1(){
        System.out.println("this is nested method in outer class");

        class InsideMethClass1{
            private int kt=33;   //-------------
            String st;
            void inmethod(){
                 int k=99;
                System.out.println("this is inside method1"+m+" "+st);

                // private class static1{   // we cannot use static or private class  inside methods  

                // }
            }
            static void inmethod2(){

                abstract class Deep{
                    void methdo1(){
                        System.out.println("this is deep method1 ");
                    }
                    abstract void metodh2();
                }
                int m=78;
                System.out.println("this is static method inside method1");

                Deep ob22=new Deep() {

                    @Override
                    void metodh2() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'metodh2'");
                    }
                    ;
                };
            }class inside2{
                void insidemeth(){
                    System.out.println("this");
                }
            }
            
        }
        
    
        // InsideMethClass1 ob1=new InsideMethClass1();
        // System.out.println(ob1.kt+" "+ob1.st+" "+m);

        
    }
    NestedMethodClass(){
        int at=77;
        System.out.println("this is outernested constructor");

        class NestConClass{
            int a=87;

            void methodCon(){
                System.out.println("this nested constructor"+at);
            }
        }
        NestConClass obCon=new NestConClass();
        System.out.println(obCon.a);
        obCon.methodCon();
        

    }
    public static void main(String[] args) {
        NestedMethodClass Nesob1=new NestedMethodClass();
        Nesob1.nesMetClass1();
      
        
    }
    
}
