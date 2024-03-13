package oopss;

public class Pracrice {

    static int k=10;//---static variable


    void method(){
        int l=3;

    }
    public static void main(String[] args) {
        // int m=99;
        // float f=2.3f;
        // int q=(int)f;
        //  char c;
        // //int c= f+m;
        // int a=10;
        // int b=20;
        // System.out.println(a);
        // // need min number by using terinary operator
        // int max=++a<b&&a>b?a:b;
        // System.out.println(max);

        // //System.out.println(k);
        // System.out.println();

        int a=10;
        int b=20;
        int c=30;
        if(a>b){
        System.out.println("it is true");
        System.out.println("");}
        else if(b<c)
        System.out.println("it is false");
        else System.out.println("it is true");

        //print aeiou adn AEIOU are vowels or it is consonants
        char ch = 'a';

        switch (ch) {
            case 'a', 'e', 'i','o','u','A','E','I','O','U':
            System.out.println("it is a vowel");
                
                break;
        
            default:
            System.out.println("it is consonanat");
                break;
        }
    }
    
}
