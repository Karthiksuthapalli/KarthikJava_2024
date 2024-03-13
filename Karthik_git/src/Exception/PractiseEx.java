package Exception;

import java.io.IOException;

public class PractiseEx {


    void show(){

    }
    void show1(){

    }
    void show2()throws IOException{


    }
    void show3() throws ArrayIndexOutOfBoundsException{

    }
    void show4() throws ArithmeticException,IOException{

    }
}
class ExceptionDe extends PractiseEx{

    void show() throws ArithmeticException{

    }
    void show1() throws IOException{  // we cannot thorw checked exceptions in child class

    }
    void show2() throws IOException, NullPointerException { // we can throw runtime exceptions along with IOE

    }
     void show3() throws StringIndexOutOfBoundsException , NullPointerException{

     }
     void show4(){

     }
}
class Karthik extends IOException{
    
    static void meth1(int num) throws ArithmeticException{
        if (num <10){
            throw new ArithmeticException("This is not u r number");
        }
        else {
            System.out.println("your number is "+num);
        }


    }
    public static void main(String[] args) {
        try{
        meth1(2);
        }
        catch(ArithmeticException ae){
            meth1(90);
            System.out.println("resolved ");
        }
    }
}