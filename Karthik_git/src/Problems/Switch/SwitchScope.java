package Problems.Switch;

public class SwitchScope {
    public static void main(String[] args) {
        int a=10;
        int k=switch(a){
            case 5 : {
                System.out.println("this is first case ");
            yield 15;
            }

            default : {
                System.out.println("this is default");
                yield 0;
            }
            
        };
        System.out.println(a+" "+k);

    }

    
    
}
