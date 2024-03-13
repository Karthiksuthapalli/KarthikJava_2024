package Problems.For;

public class Pascals {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.println();
            }
            for(int l=1;l<=n;l++){
                System.out.println();
            }
        }
    }
    
}
