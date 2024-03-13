package Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10;
        int b=0;
      //  System.out.println(a/b);  // arithmetic Exception

      String st=null;

     // System.out.println(st.length());  // nullpoiter exception

     String st1="22";
     int a1=Integer.parseInt(st1);

     System.out.println(a1);

     String st2="yy";
    // int a2= Integer.parseInt(st2);

    // System.out.println(a2);  // number Format Exception

    int k[]=new int[5];
  //  k[10]=88;                 //arrays bound exception


  try{
    System.out.println(a/b);
    System.out.println("i am in try block");// this one not gonna print because it jumps to catch block
  }
  catch(ArithmeticException ex){
    System.out.println( ex);
    System.out.println("i am in catch block");
   // System.out.println(a/b); here iy throws the exception and not print remianing code

  }
//by using different types exception for different it throws exception
//   try{
//     System.out.println(a/b);  
//   }
//   catch(NumberFormatException en){
//     System.out.println(en);
//     System.out.println("this is in number format");   
//   }

   try{
    int ar[]={1,2,3,4};
    System.out.println(ar[10]);

   }
   catch(ArrayIndexOutOfBoundsException ar){
    System.out.println(ar);
   }

  System.out.println("this is remaining");





    }
    
    
}
