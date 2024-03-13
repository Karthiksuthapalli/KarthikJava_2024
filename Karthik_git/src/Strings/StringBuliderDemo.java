package Strings;

public class StringBuliderDemo {
    //with same like stringbuffer we can also create mutable strings 
    //not thread safe or non synchronised
    //bulider is faster
    public static void main(String[] args) {
        StringBuilder st1=new StringBuilder();
        System.out.println(st1.capacity());

        StringBuilder st2=new StringBuilder("Tesla");
        System.out.println(st2+" "+st2.length()+" "+st2.capacity());

        StringBuilder st3=new StringBuilder(80); 
        st3.append("Hello tesla");
        System.out.println(st3+" "+st3.length()+" "+st3.capacity());
        System.out.println(st2.equals(st3));

    }    
}
