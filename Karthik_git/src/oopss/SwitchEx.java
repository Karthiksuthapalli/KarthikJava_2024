package oopss;

public class SwitchEx {
    public static void main(String[] args) {
        //enhance multiple
        int a = 30;
    
        switch(a){
            case 10,15,20:
                System.out.println("value is number ");
                break;
            case 25:
                System.out.println("value is 25");
                break;
            default:
                System.out.println("default value");        

        }
        //enhnace arrow
        {
        int i = 30;
            switch(i){
                case 15 -> System.out.println("value is 10");
                case 25 -> System.out.println("value is 25");
                default -> System.out.println("null");
            }
        }
        {
            int itemcode = 001;
            String  text = switch (itemcode) {
                case 001 : 
                    yield "It's a laptop!";
                   // System.out.println("");
                case 002 :
                    yield "It's a desktop!";        
                case 003 :
                    yield "It's a mobile phone!";
                default :
                    yield "not a value ";    
           };
        }
        //enhanceexception
        int k=30;
            int b = switch(k){
                case 10 -> {
                    System.out.println("10");
                    yield 10 ;
                }
                case 20 -> {
                    System.out.println("20");
                    yield 20 ;
                }
    
                case 30 -> {
                    System.out.println(("30"));
                    yield 300;
                }
    
                default -> {
                    System.out.println("0");
                    yield 0;
                }
            };
            //enhancescope
            int ad = 40;
            int ba = switch(a){
                case 1 -> {
                    int j = 10;
                    System.out.println("1 case and j is "+j);
                    yield 1;
                }
                case 40 -> {
                    int j = 10;
                    System.out.println("2nd case and j is "+j);
                    yield 40;
                }
                default -> {
                    System.out.println("default");
                    yield 0;
                }
            };
            //enhnace yield 
            {
                int i=10;
            int kt = switch(i){
                case 5 , 10, 20:
                    System.out.println("value is 5");
                    yield 5 ;
                case   25:
                    System.out.println("value is 25");
                    yield 250;
                default:
                    System.out.println("dafault value");
                    yield 0;
    
            };
            System.out.println("value of k is"+kt);
        }
        }
        

    
    
}
