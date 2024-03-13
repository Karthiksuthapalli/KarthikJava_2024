package Exception;

public class NestedTry {
    public static void main(String[] args) {
        try{
            try{
                int a=10;
                int b=0;
                System.out.println(a/b);
            }
            catch(ArithmeticException ae){
                System.out.println("inner1 catch"+ae);
            }

            try{
                int l[]=new int[9];
                l[10]=90;

            }
            catch(ArrayIndexOutOfBoundsException ie){
                System.out.println("inner 2 catch block"+ie);
            }
        }
        catch(Exception ee){
            System.out.println("outer exception"+ee);
        }
        System.out.println("exit");


        try{
            try{
                
                try{
                    int l[]=new int[5];   // here it takes parent try catch exception for indexbound
                    l[98]=99;
                }
                catch(NumberFormatException ne){
                    System.out.println("this is in number ");
                }
            }
            catch(ArithmeticException ae){
                System.out.println("inner1 catch"+ae);
            }

           
            catch(ArrayIndexOutOfBoundsException ie){
                System.out.println("inner 2 catch block"+ie);
            }
        }
        catch(Exception ee){
            System.out.println("outer exception"+ee);
        }
        System.out.println("bye");

        
        try{
            try{
                
                try{
                    int l[]=new int[5];   // here it takes parent try catch exception for indexbound
                    l[98]=99;
                }
                catch(Exception ne){
                    System.out.println("this is in number ");
                }
            }
            catch(ArithmeticException ae){
                System.out.println("inner1 catch"+ae);
            }

           
            catch(ArrayIndexOutOfBoundsException ie){
                System.out.println("inner 2 catch block"+ie);
            }
        }
        catch(Exception ee){
            System.out.println("outer exception"+ee);
        }
        System.out.println("bye");
    
    }
    
    
}
