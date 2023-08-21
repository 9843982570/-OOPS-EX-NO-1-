/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catstring;

import java.util.Scanner;


public class Catstring {

   
    public static void main(String[] args) {
 



  
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of strings you want to concatenate: ");
            int numStrings = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            String result = "";
            
            for (int i = 0; i < numStrings; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                String inputString = scanner.nextLine();
                result += inputString;
            }
            
            System.out.println("Concatenated String: " + result);
        }
    }
}
