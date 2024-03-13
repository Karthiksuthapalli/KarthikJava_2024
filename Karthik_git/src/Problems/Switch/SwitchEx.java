package Problems.Switch;

public class SwitchEx {
    final static int k=5;
    static int q;
    public static void main(String[] args) {
        //int day=6;
        int i=20;
        final int p=7;

       /*  switch(i+10){
            //case q: noe allowed beacuse it is not final
            case p:
            System.out.println("it is allowed ");
            break;
            case k:
            System.out.println("it is allowed"); // because final int and we cannot change so variables allowed 
            break;
            case 20:
            System.out.println("it is 50");
            break;
            case 50:
            System.out.println("it is 80");
            break;*/
            /*case 20:
            System.out.println('it is 50');       //it says case expression should not duplicate
            break*/

          /*  case i:
            System.out.println("it says variables not allowed");*/   //variables are not allowed
        

       switch(i){
            case (10):
            System.out.println("zero"); // it can also accept brackets

            case 20:
            System.out.println("first");
            case 30:
            System.out.println("second");
            case 40:
            System.out.println("third");
        }




      /*  switch(day){
            case 1: 
            System.out.println("it is Monday");  // if you remove break next case also will generate
          //  break;
            case 2:
            System.out.println("it is tuesday");
            break;
            case 3:
            System.out.println("it is wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("it is friday");
            break;
            case 6:
            System.out.println("it is saturday");
            break;
            case 7:
            System.out.println("it is sunday");
            break;
            default:
            System.out.println("please enter day bwtween 1 nd 7");

        }*/
        int le =0;
        String st=" expert";
        switch (st) {
            case "slower":  le=1;
            break;
            case " expert": le=2;
            System.out.println("i am expert");
            break;
            case "advance": le=0;
            break;
                
             
        }
        System.out.println( le);
    }
    
}
