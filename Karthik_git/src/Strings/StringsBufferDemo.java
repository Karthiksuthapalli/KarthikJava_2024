package Strings;

public class StringsBufferDemo {
    
    //it is used to create a mutable string 
    //String buffer class is thread safe 
    //disadavntage with string class-when we are changing  string it keep on creating new object 
    public static void main(String[] args) {
        String st="hi i am chitti";

        st.concat("kk");
        System.out.println(st);

      // to change string immutable to mutable 
      StringBuffer str1=new StringBuffer(); // 
      System.out.println(str1+" "+str1.capacity());//default capacity of string is 16
      StringBuffer str2=new StringBuffer(" Hello");
      System.out.println(str2+" "+str2.length()+" "+str2.capacity());
      str2.append(" chitti The Robot");// this append method concatenates the string 
      System.out.println(str2+" "+str2.length()+" "+str2.capacity()); // new capcity=old capacity*+2
      str2.insert(0,"wow");
      System.out.println(str2+" "+str2.length()+" "+str2.capacity());
      str2.delete(0,3);
      System.out.println(str2+" "+str2.length()+" "+str2.capacity());
      str2.deleteCharAt(1);
      System.out.println(str2+" "+str2.length()+" "+str2.capacity());
      str2.replace(0, 5, "hello");
      System.out.println(str2+" "+str2.length()+" "+str2.capacity());
      str2.reverse();
      System.out.println(str2+" "+str2.length()+" "+str2.capacity());
      str2.reverse();
      System.out.println(str2+" "+str2.length()+" "+str2.capacity());

      StringBuffer str3=new StringBuffer("This is karthik !");
    //  str3="hello this is karthik"; // if we write like this we are writing new strring
    System.out.println(str3+" "+str3.length()+" "+str3.capacity());// while we are doing first time it will add lenght to capacity
    str3.append("nothing is impossible ");
    System.out.println(str3+" "+str3.length()+" "+str3.capacity());

    StringBuffer str4=new StringBuffer(40);
    str4.append("this is java ");
    System.out.println(str4+" "+str4.length()+" "+str4.capacity());
    System.out.println(str3.equals(str4));
    
      

    }
}
