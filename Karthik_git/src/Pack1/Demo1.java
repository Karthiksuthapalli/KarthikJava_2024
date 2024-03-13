package Pack1;
import Pack2.DefaultDemo2;

public class Demo1 {


    int i=33;
    //final int m;  we cannot initiliaze variables
    final int m;
    final int k=9;

    // {
    //    m=76; //initiallization block or we can give in constructor
    // }
  // we can do either once to assign values 
  // every instance it will  change the values
  //--> this is says final key word in not final 
  
  
    static final int E=89;// for static memory allocation done once
    //we cannot change static final 
    // we cannot extend final classes  
    Demo1(){
        m=76;
        System.out.println(m);
    }

    Demo1(int a){
        m=23;
        System.out.println(m);
    }






    public static void main(String[] args) {
        Demo1 De=new Demo1();
       //System.out.println(De.m); 
       // we cannot access protecetd from non subclasses
    }
    
}
