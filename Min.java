/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package min;

import java.util.Scanner;
public class Min {

    
    public static void main(String[] args) {
       int x,y,result;
       Scanner min=new Scanner(System.in);
       System.out.println("type a number");
       x=min.nextInt();
       Scanner min1=new Scanner(System.in);
       System.out.println("type another number");
       y=min1.nextInt();
       result=(x<y) ? x : y;
       System .out.println(result+"is the min value");
       
    }
    
}
