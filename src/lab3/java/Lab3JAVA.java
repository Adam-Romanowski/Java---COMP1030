
package lab3.java;

import java.util.Scanner;



public class Lab3JAVA {
    
    

    public static void main(String[] args) {
            
        
        System.out.println("Enter three numbers and I'll tell you which one is the largest");
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        
        System.out.print("Enter second number: ");
        int y = input.nextInt();
        
        System.out.print("Enter third number: ");
        int z = input.nextInt();
         
        System.out.printf("This is the largest number: %s%n%n", LargestNumber(x, y, z));
        
        
    }
    
    //This method accepts 3 doubles and will compare and returns the largest
    public static int LargestNumber(int num1, int num2, int num3) {
    
       
        
        if (num1 > num2 && num1 > num3){
            return num1;
        }
        else if (num2 > num1 && num2 > num3){
            return num2;
        }
        else if (num3 > num2 && num3 > num1){
            return num3;
        }
        
        return 0;
        
    }
    
}
        
        
           
        

