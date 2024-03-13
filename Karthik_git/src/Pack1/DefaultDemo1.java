package Pack1;

import javax.swing.text.AbstractDocument.DefaultDocumentEvent;

import Pack2.DefaultDemo2;

public class DefaultDemo1 {

    public int i=12;
    int j=23; //we cannot access default 
    protected int k=90;

    void Display(){
        System.out.println("in pack 1  display");
    }
    protected void display2(){
        System.out.println("protected display2 in parent ");
    }

   private DefaultDemo1(){
        System.out.println("demo1 constructor in super class");

    }
    public DefaultDemo1(int i){
        System.out.println("int constructor in parent");
    }
    
}
