package Strings;

public class StringsDemo {

    String str="Hello World";
    //Strings are immutable
    // when we created a string the memory allocated in two different types
    //1. Heap memory  2. String constant pool

    public static void main(String[] args) {
        String st="Karthik";  // string illteral
        String st1="Karthik1";
        String st2="karthik";
        String st4="World";
        String st5="World";
        String st6=new String("World");

        StringsDemo ob1=new StringsDemo();
        ob1.str="java";
        System.out.println(ob1.str);

        st.concat("is working");
        //or st= st.concat("is working");
        System.out.println(st.concat(" is working"));

        st=st.toLowerCase();
        System.out.println(st);
        st=st.toUpperCase();
        System.out.println(st);
        //st=st.length();
        String str1=new String("Geekbar");
        String str2="Geekbar";
        String str3="Geekbar";
        String str4=" 15000";
        String str5="Rohith sharma";
        String str6="  Sachin Tendulkar  ";
        System.out.println(st5.equals(st4)); // due to case sensitive it is false
        System.out.println(st5.equals(st6)); //its checks only values and not references
        System.out.println(st5==st6); // its checks both values and references
        System.out.println(st5==st4);
        System.out.println(str1.compareTo(str2)); // compare to its only checking values not references
        System.out.println(str2.compareTo(str3)); // when strings are different it compare with ascii value 
        System.out.println(str3.concat(str4)); // we are not chainging just printing
        System.out.println(str5.substring(6));
        System.out.println(str5.substring(0, 5));
        System.out.println(str5.toUpperCase());// here we are not chainging the original string 
        System.out.println(str6.length());// it checks length
        System.out.println(str6.trim()); // it removes all places 
        System.out.println(str5.startsWith("Ro"));
        System.out.println(str5.endsWith("maa"));
        System.out.println(str5.charAt(4));
        int i=90;
        String st7=String.valueOf(i);//coverting int to string 
        System.out.println(str5.replace("Rohith", "Batsman"));
        char ch[]={'j','k','l'};
        String st8=String.valueOf(ch);
        System.out.println(st8);


        //String format
        








    }
    
}
