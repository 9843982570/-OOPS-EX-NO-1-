
package Javaapllication3;

import java.util.Scanner;

public class Javaapllication3{
    public static void main(String[] args){
        int n ;
        int count = 0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number for to count of numbers with the digit 5 ");
                n=obj.nextInt();
        for (int i = 1; i<=n; i++){
            if(containsdigit(i,5)){
                count++;
            }
        }
        System.out.println("count of numers with the digit 5:" +count);
    }
    public static boolean containsdigit(int number, int digit){
        while (number >0){
            if (number % 10 == digit){
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
