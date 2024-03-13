package Problems.Patterns;

public class Prob {
    public static void main(String[] args) {
       /* int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(j);
                }
               // System.out.println();

            } 
            System.out.println();

        }*/


        
       // problem 4
            
             /*   int rows = 10;
        
                for (int i = 1; i <= rows; i++) {
                    int value = i;
                    for (int j = 1; j <= i; j++) {
                        System.out.print(value + " ");
                       // value ++;
                        value+=i;
                       
                    }
                    System.out.println();
                }
             */
        //problem 5
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if(i==j){
                System.out.print(i);
               }
               else{
                System.out.print(" ");
               }
            }
            for(int k=n;k>i;k++){
                System.out.print("* ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println( );

        
                        

    }
    
}
}
