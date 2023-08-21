package prob;
import java.util.Scanner;
    public class  Prob {
        public static void main(String[] args) {
        int up,q,revenue,discount;
        Scanner prob=new Scanner(System.in);
        System.out.println("enter unit prince");
        up=prob.nextInt();
        Scanner prob1=new Scanner(System.in);
        System.out.println("enter quantity ");
        q=prob1.nextInt();
        revenue=(q*up);
        System.out.println(revenue+"your revenue");
         if (q>=100 && q<=120)
        {
             double dis =revenue*(0.1);
                System.out.println(dis+"congrats you have 10% discount");
        }
            else if(q>120)
            {
                double dis=revenue*(0.15);
                    System.out.println(dis+"congrats you have 20% discount");
            }
            else if(q<100)
            {
                 double dis =revenue*(0);
                    System.out.println(dis+"sorry no discount");
            }
            else
            {
                System.out.println("thanks for purchsing");
            }  
    }
}