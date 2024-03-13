package Exception;

import java.io.IOException;

public class CheckedCustomEx extends IOException{  //checked customexception all are checked at compile time
    //here we extend IOException

    CheckedCustomEx(String message){
        super(message);
    }


    
}

class Sample1 {
    
    

    public static void main(String[] args) {
        int age =18;
        try{
            if( age >18){
                System.out.println("ekligible");

            }
            else{
                CheckedCustomEx ch=new CheckedCustomEx("not eligible");
               // throw new CheckedCustomEx("not eligible");
               throw ch;
               
            }
            

        }
        catch(CheckedCustomEx c){
            System.out.println(c);

        }
    }
}
/*
 * An exception is an issue (run time error) that occurred during the execution of a program.
 * User-Defined Exception or custom exception is creating your own exception class and throwing that exception using the ‘throw’ keyword.
 *  throw keyword in Java is used to explicitly throw an custom exception from a method or block code
 * throws keyword is required only for checked exceptions
 * we cannot write anything after throw
 * 
 * 
 * IOException: This exception is thrown when an input/output operation fails, such as when reading from or writing to a file.
SQLException: This exception is thrown when an error occurs while working with a database.
FileNotFoundException: This exception is thrown when an attempt to open a file for reading fails because the file cannot be found.
 */
