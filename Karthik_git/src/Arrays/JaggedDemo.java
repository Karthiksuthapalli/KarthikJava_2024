package Arrays;

public class JaggedDemo {


    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6,7},{8,9,11,12,13}};

        int ar[][]=new int[3][];

        ar[0]=new int[3];
        ar[1]=new int[4];
        ar[2]=new int[5];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
