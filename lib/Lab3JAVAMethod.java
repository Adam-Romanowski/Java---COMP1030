
package lab3javamethod;


public class Lab3JAVAMethod {
         
    
    public double largestNumber(double x, double y, double z, double result) {
        
        if (x > y && x > z){
            result = x;
        }
        else if (y > x && y > z){
            result = y;
        }
        else if (z > y && z > x){
            result = z;
        }
        return result;
           
    }
    
}
