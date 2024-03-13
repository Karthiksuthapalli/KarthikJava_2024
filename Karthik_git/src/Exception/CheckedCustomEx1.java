package Exception;

//import java.io.IOException;

public class CheckedCustomEx1 extends Exception{  //checked customexception all are checked at compile time
    //here we extend IOException

    CheckedCustomEx1(String message){
        super(message);
    }
    CheckedCustomEx1(int num){
        System.out.println(num);
        //super(num);
    }
    
    static void validate(int age) throws CheckedCustomEx1 { // here we can throes any number of exceptions
        // if we dont want to use throws we have to write try and catch in the medthod it self
        if( age >18){
            System.out.println("eligible ");

        }
        else{
            CheckedCustomEx1 ch1=new CheckedCustomEx1("not eligible");
           // throw new CheckedCustomEx("not eligible");
           throw ch1; // here we have to handle the exception
           
        }

        
        

    }
    static void validate2(int number) throws CheckedCustomEx1{
        if (number<10){
            System.out.println("you got your number");
        }
        else{
            throw new CheckedCustomEx1("this is not your number");
        }

    }

    public static void main(String[] args) { // we can also throws exceptions from main method
        int age =18;
        int number =14;
        try{
            validate(age);
        }catch(CheckedCustomEx1 cc){ // we have to use same signatuer use in throws exce[tions]
            System.out.println(cc);

        }
        try{
            validate2(number);
        }
        catch(CheckedCustomEx1 cd){
            System.out.println(cd);
        }
        //while we use throws keyword we have to handle the excxeption
       
    }


    
}
