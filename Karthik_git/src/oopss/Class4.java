package oopss;

public class Class4 {
    public static void main(String[] args) {
        Class3 k1=new Class3(22,"karthik",6.7);//this one not gomna print beacuse ambiguity b/w instanve and parameters
        Class3 k2=new Class3(1,"Avanthi");
        k1.method1();
        k2.method1();
      //  k2.method2(); we cannot acces beacuse it is private 
      System.out.println(k1.z);
    //  System.out.println(k2.q);
    int k=k1.method4();

    }
    
}


//reusing constructor
//4,5,6 this methods
//int q
