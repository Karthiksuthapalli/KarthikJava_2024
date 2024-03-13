package oopss;

public class EncapsulationPra2 {

    public static void main(String[] args) {
        EncapsulationPra ob=new EncapsulationPra();
        //ob.method1(5,6);
        // System.out.println( ob.method1(5,6));
        // //System.out.println(ob.i); we cannot access because it is private
        // //System.out.println(ob.getI());
        // //ob.setI(77);
        // System.out.println(ob.getI());
        // //System.out.println(ob.setI(65)); we cant prnt directly from set method
        
        
        // System.out.println(ob.getB());
        // System.out.println(ob.getS());
        // ob.setS("avanthi");
        // System.out.println(ob.setS("avanthi")); // void cannot 

         System.out.println(ob.getI());
        ob.setI(3);
        System.out.println(ob.getI());
    }

    
}
