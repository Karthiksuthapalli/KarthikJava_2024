package Pack1;


import Pack2.Practise2;

public class Practise1 extends Practise2 {

    int kk=99;

    void meth1(){
        System.out.println("this is meth1");
    }

    // Practise1(){
    //     super();
    //     System.out.println("constructor in practise 1");
    // }


    public static void main(String[] args) {
        Practise1 ob=new Practise1();
       Practise2 ob2=new Practise2(); 
        ob.show1();

        
        

        

    }
    
}
