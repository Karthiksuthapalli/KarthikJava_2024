package Exception;
import java.io.IOException;
import java.util.*;



public class ChainedEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int i=sc.nextInt();

        try{
            if(i<0){
                throw new IllegalArgumentException(" number must be positive");
            }
            else {
                int result=100/i;
            }

        }catch(IllegalArgumentException ie){
            throw new RuntimeException("Invalid Input " +ie);

         }
        //  catch(ArithmeticException ae){
        //     throw new RuntimeException("null");
        // }
    }
    
}
class TestEx{
    static void meth1() throws Throwable{
        try{
            int a=100/0;

        }catch(ArithmeticException e){
           // e.printStackTrace();
           // throw new IOException("invalid");
           throw e.initCause(new IllegalArgumentException("we are unable to hand"));
        }
    }
    public static void main(String[] args) {
        try{
        meth1();
        }
        catch(Throwable I){
          System.out.println(I.getCause());

        }

    }
}
