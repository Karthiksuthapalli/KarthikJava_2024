package Exception;

public class UncheckedCus extends RuntimeException {
    //arthematic and arraybound are all runtimeExceptions
    UncheckedCus(String message){
        super(message);
    }

    
}
class Sample2{
    public static void main(String[] args) {
        int weight =40;

        try{
            if(weight >50){
                System.out.println("eligible to donate");
            }
            else{
                UncheckedCus un=new UncheckedCus("not eligible to donate");
               // UncheckedCus un=new UncheckedCus();
                throw un;
            }
        }catch(UncheckedCus uun){  // we can also give super class exception 
            System.out.println(uun);
            System.out.println(uun.getMessage());

        }
    }
    
}
