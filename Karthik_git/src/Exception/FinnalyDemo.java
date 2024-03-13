package Exception;

public class FinnalyDemo {
    public static void main(String[] args) {
        try{
            int k[]=new int[5];
    
            k[4]=20/4;  
        }                          
      
        catch(ArithmeticException ae){
            System.out.println("this is arithmetic");
            
        }
        catch(ArrayIndexOutOfBoundsException ie){
            System.out.println("this is an indexbound");
        }
        catch(Exception e){   //but this is not good way to practice
            System.out.println("this  is parent exception");
        }

        finally{
            System.out.println("it always excuted whether it exception or not");
        }
    
      
    
    
       System.out.println("this is remains");

       try{
        int k[]=new int[5];

        k[4]=20/0;  
    }                          
  
    catch(ArithmeticException ae){
        System.out.println("this is arithmetic"+ae);
        
    }
    catch(ArrayIndexOutOfBoundsException ie){
        System.out.println("this is an indexbound");
    }
    catch(Exception e){   //but this is not good way to practice
        System.out.println("this  is parent exception");
    }

    finally{
        System.out.println("it always excuted whether it exception or not");
    }

    try{
        int k[]=new int[5];

        k[7]=20/4;  
    }                          
  //we can also write zero catch block if we have finally block
  //but for class it have only one final block 
    

    finally{ // this is only case will not exit if it is terminated 
        System.out.println("it always excuted whether it exception or not");
    }
        }
        
    }
    
    
    
