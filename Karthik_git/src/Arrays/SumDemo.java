package Arrays;

public class SumDemo {

    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{3,2,1,},{8,7,6},{8,7,9}};

        int c[][]=new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
