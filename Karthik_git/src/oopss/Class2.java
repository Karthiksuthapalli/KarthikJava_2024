package oopss;

public class Class2 extends Class1  {
    
    public static void main(String[] args) {
        // to access constructors in class1 
        Class1 student1= new Class1(6);
      // Class2 s=new Class2(5);
       Class1 ob=new Class1(25);

   //Class1 student2=new Class1(2,"avanthi",988);
    //Class1 student3=new Class1("rajesh");
    //Class1 s4=new Class1();
    //System.out.println(student3.Stname);
    //System.out.println(student2.Stid+""+student2.Stname+student2.salary);
     //System.out.println(student2.Stid+" "+student2.Stname+" "+student2.salary);
     //to access methods object.methodname 
     //to access variables object.variable name 
     
     
  // student3.method1();
    student1.add(1,2);
    student1.method3(33);
    System.out.println(student1.method3(33));
     //student1.Stid=1;
    // student1.Stname="karthik";
    // student1.salary=900000;
     //System.out.println(student1.Stid);
    // System.out.println(student2.Stid);
    // int ka1=student1.Stid;
    //int add1=student1.sum;
     System.out.println(student1.sum);

       
       

    }
  
    Class2(int y){
     // System.out.println("tt");
      super(2); // we have to write super keyword in first line
      System.out.println("ss");
    }
    
}
