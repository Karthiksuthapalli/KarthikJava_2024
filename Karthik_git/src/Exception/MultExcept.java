package Exception;

public class MultExcept {

    public static void main(String[] args) {
    //     int a=10;
    // int b=0;
    try{
        int k[]=new int[5];

        k[5]=20/0;                             // =----
      //  k[5]=20;  //indexbpundexception 
      //each time only one excetion can be handled
        //System.out.println(a/b);
        
    }
    // catch(Exception e){   //if wew write at starting exception in multiple catch it says error
    //     System.out.println("this  is parent exception");
    // }
    catch(ArithmeticException ae){
        System.out.println("this is arithmetic");
        
    }
    catch(ArrayIndexOutOfBoundsException ie){
        System.out.println("this is an indexbound");
    }
    catch(Exception e){   //but this is not good way to practice
        System.out.println("this  is parent exception");
    }

  


   System.out.println("this is reamaining");
    }
    
}
