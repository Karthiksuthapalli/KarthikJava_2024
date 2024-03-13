package oopss;

public class EncapsulationPra {

    // wrapping up data and methods under single unit
    private int i=10;
    private boolean b=true;
    private String s="karthik";
    private int k=44;
    int sum;

    int method1(int num1,int num2){
       // sum=num1+num2;
        return num1+num2;
    }

    //getters and setters to access private data
    //by this method we only hide the data and not methods

    public int getI(){
        return i;
    }
     public void setI(int i) {
      //  System.out.println("this is");
        this.i = i;
    }
    public boolean getB(){
        return b;
    }
    public void setB(boolean b){
        this.b=b;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }


    
}
