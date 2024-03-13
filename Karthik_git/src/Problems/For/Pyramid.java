package Problems.For;

public class Pyramid {

    //hlaf pyramid -problem no:17
    
    /*public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              System.out.print("* ");
            }
           System.out.println( );
        }
        
    }
    */
    
    //inverted half pyramid -Problem no:20
   /*  public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
              System.out.print("* ");
            }
           System.out.println( );
        }
        
    }
    */
     
    //Full Pyramid Problem no:22
   /*  public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");

            }
            for(int k=1;k<i;k++){
                System.out.print("* ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println( );
            
        }
    }
    */

    //Inverted full Pyramid Problem no:24
   /*/ public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
               System.out.print("* ");
            }
            for(int j=i;j<=n;j++){
              System.out.print("* " );
            }
            System.out.println( );
        }
       
    }
    */

    //diamond shape Problem no:27
     /*/
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");

            }
            for(int k=1;k<i;k++){
                System.out.print("* ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println( );
            
        }
         
          
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
               System.out.print("* ");
            }
            for(int j=i;j<=n;j++){
              System.out.print("* " );
            }
            System.out.println( );
        }
    }
    */
     
    //sand glass pattern problem no:30
   /*/ public static void main(String[] args) {
        
            int n=7;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("  ");
                }
                for(int j=i;j<n;j++){
                   System.out.print("* ");
                }
                for(int j=i;j<=n;j++){
                  System.out.print("* " );
                }
                System.out.println( );
            }
           
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    System.out.print("  ");
    
                }
                for(int k=1;k<i;k++){
                    System.out.print("* ");
                }
                for(int l=1;l<=i;l++){
                    System.out.print("* ");
                }
                System.out.println( );
                
            }
        
    }
    */
    //Right Pascal's Triangle Problem no:28
    /*public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
              System.out.print("* ");
            }
           System.out.println( );
        }

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
              System.out.print("* ");
            }
           System.out.println( );
        }
        
    }
    */

    //Left Pascal's Triangle Problem no:29

  /*  public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    */

    public static void main(String[] args) {
        int n=4;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
            
                System.out.print(" *");
            }
            System.out.println(" ");

        }
    }
    
}
