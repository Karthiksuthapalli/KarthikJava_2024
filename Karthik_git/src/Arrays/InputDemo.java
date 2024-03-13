package Arrays;
import java.util.*;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //first we have decide rows and columns 
        System.out.println("enter rows and columns");
        int l=sc.nextInt();
        int m=sc.nextInt();

        int a[][]=new int[l][m];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

    
}
class singleDemo{
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int q=sc1.nextInt();
        int b[]=new int[q];

        for(int i=0;i<q;i++){
            b[i]=sc1.nextInt();

        }
        for(int i=0;i<q;i++){
            System.out.print(b[i]);

        }

    }
}