package Pack2;

abstract public class AbstractDemo1 {// or  public abstract class 

  int x=10;
  int y=20;
  
  abstract void method1(); 
  abstract int method5(int k);
  
  // it doesnot have implementation forabstract methods
  protected abstract void method();
  static int method2(){
    System.out.println("static method 2 in abstract class");
    return 10;
  }
  final static void method3(){
    System.out.println("this is static final method 3 in abstract class");

  }
  void method4(){
    System.out.println("this regular method 4 in abstract class");
  }
  final void method7(){
    System.out.println("this is final method 7");
  }

  // AbstractDemo1(){
  //   System.out.println("this is constructor in AbstractDemo1");
  // }
  // AbstractDemo1(int k){
  //   System.out.println("this int constructor demo");
  // }
  public static void main(String[] args) {
    // AbstractDemo1 ab1=new AbstractDemo1() {          // abstract methods cannot initiate
        
    // }
  }

    
    
}




// it achievs 0 to 100% abstrcation 
//it can have both abstract and non abstract methods
//it is the process hiding the implementation details and function details
// it can inherit both abstract class and normal class 
class sample extends AbstractDemo1{

  void method1(){
    System.out.println();
  }
 
  @Override
  int method5(int k) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'method5'");
  }

  @Override
  protected void method() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'method'");
  }
 
}

 abstract class sample2{

  abstract void dis1();
  

}
class sample5 extends AbstractDemo1{

  @Override
  void method1() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'method1'");
  }

  @Override
  int method5(int k) {
    System.out.println("this is ");
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'method5'");
  }

  @Override
  protected void method() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'method'");
  }
  public static void main(String[] args) {
    sample5 kk=new sample5();
    kk.method5(5);
  }

}
