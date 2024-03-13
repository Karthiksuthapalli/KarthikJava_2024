package oopss;

public class PolyDemo1 {

    /* it divided into two types 
     1. compile time polymorphism-or static polymorphism - it happen when method overloading
     2.runtime ploymorphism-or dynamic polymorphism -it happens method overriding

     */
  //  int a;
    //int b;
    void show(double d1,double d2){
        System.out.println((d1+d2));
    }
    // int add(int a,int b){
    //  //   this.a=a;
    //    // this.b=b;
    //    return a+b; //System.out.println(a+b);
    // }
    long add(int a,long b){
        System.out.println("converting ");
        return a+b;
    }
    int add(long a,long b){
        System.out.println(a+b);
        return 10;
    }
    int add(long a, int b){
        System.out.println();
        return b;
    }
    String method(int a,String st){
        return a+st;
    }
    int method2(int a,char ch){
        return a+ch;
    }


    public static void main(String[] args) {
        PolyDemo1 ob1=new PolyDemo1();
        // ob1.show(23.33,45.66);
        // //System.out.println(ob1.show(23.33,45.66));

        // System.out.println(ob1.add(12,34));
        // System.out.println(ob1.method(22,"kk"));
        // System.out.println(ob1.method2(2,'c')); //printing ascii values of c
         // System.out.println(ob1.add(7,7));

    }
    
}
