package Arrays;

public class MultiDemo {
    public static void main(String[] args) {
        
        int i[][]=new int[3][3];// we have to mention rows and we can leave columns

        i[0][0]=1;
        i[0][1]=2;
        i[0][2]=3;

        i[1][0]=4;
        i[1][1]=5;
        i[1][2]=6;

        i[2][0]=7;
        i[2][1]=8;
        i[2][2]=9;

        int k[][]={{2,2,2},{3,3,3},{5,5,5}};


        for(int l=0; l<i.length;l++){
            for(int m=0;m<i.length;m++){
                System.out.print(i[l][m]+" ");
            }
            System.out.println();
        }

    }
    
}
