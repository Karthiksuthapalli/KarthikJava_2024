package Exception;

 
    public class UncheckedCus1 extends RuntimeException {
        //arthematic and arraybound are all runtimeExceptions
        UncheckedCus1(String message){
            super(message);
        }
    
        
    }
    class Sample3{
        public static void main(String[] args) {
            int weight1 =40;
           // Blood(weight1);

            try{
                Blood(weight1);  // here we are calling the methgod and handling the exception at the same time
            }
            catch(UncheckedCus1 us1){
                System.out.println(us1);

            }
    
            
        }

        static void Blood(int weight1){

            
            
                if(weight1 >50){
                    System.out.println("eligible to donate");
                }
                else{
                    UncheckedCus1 un1=new UncheckedCus1("not eligible to donate");
                   // UncheckedCus1 un=new UncheckedCus1();
                    throw un1;
                }
            }
            

        }
        


 class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }  catch(ArithmeticException ex)
        {
            System.out.println("This block handles all exception types");
        }
 
      
 
        catch(NumberFormatException ex)
        {
            //Compile time error
            //This block becomes unreachable as
            //exception is already caught by above catch block
        }
        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
    }
}
        
    
   

