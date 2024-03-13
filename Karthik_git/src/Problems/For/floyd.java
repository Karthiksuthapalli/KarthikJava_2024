package Problems.For;

public class floyd {
    public static void main(String[] args) {
int n=5,count=1;
         
       /* for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(count+" ");
                count++;

            }System.out.println();
        }*/

       //numbers 1 to 10 in pyramid half 
       /* for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(count+" ");
                count++;

            }System.out.println();
        }*/

        //half pyramid using numbers problem no:18
       /* for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
                

            }System.out.println();
       

        }*/


        // inverted half pyramid using numbers problem no:21
       /* for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
                

            }System.out.println();
        } */
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
                
            }for(int k=1;k<=2*i-1;k++) {
                System.out.print(k+" ");
                //count++;
            }   

            
            System.out.println();
        } 

        

    }
}
