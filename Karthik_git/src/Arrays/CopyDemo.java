package Arrays;

public class CopyDemo {
    public static void main(String[] args) {
        //arracopy
        int a[]={1,2,3,4,5,6,7,8};
        int b[]=new int[10];
        System.arraycopy(a, 3, b, 2, 3);
        for(int j=0;j<b.length;j++){
            System.out.println(b[j ]);
        }

        for (int c:b){
            System.out.println(c);
        }
        for(int i=0;i<a.length;i++){
            int d[]=b;
            System.out.println(d[i]);
        }
        System.out.println();

        //clonning of an array
        //If it is single dimension ,it creates deep copy 
        char ch1[]={'a','b','c','d','e','f'};
        //char ch2[]=new char[10];
      char ch2[]=ch1.clone();
      ch1[0]='z';
      for(char i:ch2){
        System.out.println(i);
      }
      System.out.println(ch1==ch2);
      //multi dimensional array
      int ab[][]={{1,2,3},{4,5,6},{7,8,9},{44,55,66}};
      // if we create the clone ,it creates the shallow copy of an array

      int d[][]=ab.clone();
      for(int[] ef: d){
        for(int ff:ef){
            System.out.print(ff+" ");
        }
        System.out.println(" ");

      }
      for(int i=0;i<ab.length;i++){
        for(int j=0;j<ab[i].length;j++){
            System.out.print(ab[i][j]);
        }
        System.out.println(" ");
      }
      System.out.println(d==ab);
      




    }
    
}
//shallow copy-class a (variables i and j)= after creation obj
//obj.1=10;ibj.j=22; and and create new obj1=obj (here both objets are referring same values or adress) 
//deep copy -here we are cpoying eaech variable to object  obj1.i=obj.i
// here creatinh two mew objects and pointing different adress (but it is tough if we have more variables)
//cloning-it will create new obj anf new vairbles (it assign automatically)