package Arrays;

public class KarthikObj extends Object{
    //every class has super class and it extends object by implicitiy

    int money;
    String Place;
    float height;
   // public String toString() {
  //      return getClass().getName() + "@" + Integer.toHexString(hashCode());
  //  }
  /* public boolean equals(Object obj) {
            return (this == obj);
        }
        */
        //we can override this methods 

    // public String toString(){
    //     return Place+": "+money;
    // }
    // public boolean equals(KarthikObj that)
    // {
    //    /* if(this.Place.equals(that.Place)&&this.money==(that.money))
    //         return true;
    //      else 
    //         return false;
    //         */
    //        // we can also return in one line 

    //         return this.Place.equals(that.Place)&&this.money==(that.money);
    
    // }



    // these are taken from IDE
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + money;
        result = prime * result + ((Place == null) ? 0 : Place.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        KarthikObj other = (KarthikObj) obj;
        if (money != other.money)
            return false;
        if (Place == null) {
            if (other.Place != null)
                return false;
        } else if (!Place.equals(other.Place))
            return false;
        return true;
    }
    
    




    @Override
    public String toString() {
        return "KarthikObj [money=" + money + ", Place=" + Place + "]";
    }
    KarthikObj(){

    }

    KarthikObj(int money,String Place){
        this.money=money;
        this.Place=Place;

    }


    public static void main(String[] args) {
        KarthikObj ob1=new KarthikObj();
        ob1.money=10000;
        ob1.Place="Banglore";
        System.out.println(ob1);// it prints some class name and hexa number   
        System.out.println(ob1.toString()); //both prints same address like -getClass().getName() + '@' + Integer.toHexString(hashCode())


        KarthikObj ob2=new KarthikObj();
        ob2.Place="Banglore";
        ob2.money=10000;

        System.out.println(ob1==ob2);// flase
        //System.out.println(ob1.equals(ob2));//flase even values same but adresess are different
        //here euqlas method getting from super class of object and in superr class it comparing adresess
        System.out.println(ob1.equals(ob2));

        KarthikObj ob3=new KarthikObj();
        ob3.Place="Banglore1";
        ob3.money=10000;

        KarthikObj ob4=new KarthikObj(12000,"Hyderbad");
        Class a= ob4.getClass();

        System.out.println(ob4.getClass());
        //System.out.println(ob4.getClass().getName());
        System.out.println(a.getName());

       


    }

   
}

