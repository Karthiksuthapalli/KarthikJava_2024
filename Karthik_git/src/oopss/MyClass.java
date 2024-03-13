package oopss;

public class MyClass {
    //int i=10;

    //passing an object reference as an argument to a method within the same class:
    
    void Display1(MyClass kk){
        System.out.println(kk);
        System.out.println("this is display method");

    }
    void Display2(){
        Display1(this);
        System.out.println(this);
    }


    public static void main(String[] args) {
        MyClass ob1=new MyClass();
        //ob1.Display2();
       // MyClass kk;
      // ob1.Display1(ob1);
       System.out.println(ob1);
       ob1.Display2();
       
    }
}

/*important point
1.When you pass this as an argument to a method, you're essentially passing the current object itself to that method.
 */

 class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails(Person person) {
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }

    void displayDetails() {
        printDetails(this); // passing the current object using "this"
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        person1.displayDetails(); // calling displayDetails method
    }
}
//In this example, when displayDetails() is called on person1, it internally calls printDetails(this), passing person1 itself as an argument.
