package Pack2;

import Pack1.DefaultDemo1;

public class DefaultDemo2 extends DefaultDemo1 {

    protected int m=10;

    DefaultDemo2(){
        super(65);
        System.out.println("demo1 constructor in child class");

    }
    



    public static void main(String[] args) {
        DefaultDemo2 ob=new DefaultDemo2();
        System.out.println("numbers are "+ob.i+" "+ob.k);
        //ob.Display(); we cannot access default variables and methods from different packages 
        ob.display2();

       
    }
    
}
// we can access protected variables and methods from different packages 
