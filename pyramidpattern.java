 package pyramidpattern;

public class pyramidpattern{

    public static void main(String args[]){
       int r=5, k=1;
       for(int i=1; i<=r; ++i, k=1){
           for(int space = 1; space <= r-i; ++space ){
               System.out.print(" ");
               
           }
           while(k != 2 * i -  1){
               System.out.print( k+"");
               ++k;
           }
           System.out.println();
        }
 
     }
}

   
     
  
    
    

