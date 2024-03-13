package Strings;

public class ToStringDemo extends Object{
    int a;
    String st;
    float f;


    ToStringDemo(int a,String st,float f){
        this.a=a;
        this.st=st;
        this.f=f;


    }
   public String toString(){ // we are overriding to string method from object(super class)
        return a+" "+st+" "+f;
    }

    public static void main(String[] args) {
        ToStringDemo ob1=new ToStringDemo(22, "karthik", 8.8f);
        System.out.println(ob1.a+" "+ob1.st+" "+ob1.f);
        System.out.println(ob1);//internally it takes as ob1.tostring
        //because every class is a child class of duper class object
    }
    
}
