package oopss;

public class outer11 {
    
        int lang;
    
        private class inner1{
            void k1(){
                System.out.println("i am private");
    
            }
            

        }    
           
        public void accessk1(){
                inner1 inner = new inner1();
            inner.k1();
        }
        
    }
     class Main {
        public static void main(String[] args) {
            outer11 outer23 = new outer11();
            outer23.accessk1();
            
        }
    }
    

