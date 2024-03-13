package Pack2;

public class AbstarctDemo2 extends AbstractDemo1 {

    
   void method1(){
    super.method3();
    
    System.out.println("this is abstarct implementation method1");
   }
   int method5(int u){
    System.out.println();
    return 55;
   }
//    final static void method3(){
//     System.out.println("this ");    
//    }

  protected  void method(){
    System.out.println("this is protected abstract method ");
   }
//    final void method7(){

//    } 

   AbstarctDemo2(int k){
      System.out.println("");

}


   public static void main(String[] args) {
    //AbstractDemo1 ab1=new AbstractDemo1() 
    //AbstractDemo1 ab1=new AbstarctDemo2();  //doubt 
   // AbstarctDemo2 ab2=new AbstarctDemo2();



   }
   @Override
   void dis1() {
     System.out.println(" ");
   }



    
}
/*
 * 1. we Cannot override final static methods
 * 2. we cant iniitiate abstract classes 
 * 3. we cannot override final methods 
 */
class sample3 extends AbstarctDemo2{

   sample3(){
      System.out.println("this is constructor");
   }

   public static void main(String[] args) {
      sample3 os=new sample3();
   }

}