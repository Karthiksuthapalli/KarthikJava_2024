package Arrays;

public class ArraysDemo {

    

    static void method(int arr1[]){
        System.out.println( "this is method   "+arr1[0]);

    }
    static int[] method2(int arr2[]){
        System.out.println(" retuening");

       // return new int[] {1,2,3};  
       return arr2;

    }

    public static void main(String[] args) {
        int[] Arr1={33,5,6,7};
        

        int Arr [];    // declration of array

        String str[]=new String[3]; //instantation of array

        int i[]=new int[4];// for instatation we have to decalre the size of an array

       str[0]="ka";   // installization of an array
       str[1]="rt";
       str[2]="hi";
       str[3]="kk";

       // all three in one line

       int arr[]={1,2,3,4,5,6,7,8,9};

       // how to acccess array elements 

       //for each loop or for loop

       for(int j=0;j<arr.length;j++){  // when it comes for loop we print array reverse but
        System.out.println(arr[j]);      // not possible in for each loop
       }// here we are desaling with index

       //for each loop
       for(int k :arr){
        System.out.println(k); // here we are dealing with value int k=1
       }

       //passing an array to method
    int b[]={2,3,4};
       method(b);
    //passing anonymous array
    method(new int[]{23,4,5,6});


    //returning array 
    method2(b);

         





    }
    
}

//static binding-it occurs when method overloading(it done during compilation)
//Dynamic binding-it occurs when method overrrding

