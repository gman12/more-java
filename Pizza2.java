
package pizza2;

import java.util.*;


public class Pizza2 {

    public static final double PI = Math.PI;
     
    public static void main(String[] args) {
        int diameter;   // Declars a variable for diameter of pizza
        int numslices;  // Declares a variable for number of slices in pizza
        
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter the pizza diameter: ");
        diameter = console.nextInt();
        System.out.print("Enter the number of slices: ");
        numslices = console.nextInt();
        
        double areaslice = areaPerSlice(diameter, numslices);
        
        System.out.print("For a " + diameter + "\" pizza of " + numslices + ", one");
        System.out.println(" slice has " + areaslice + "square inches of pizza.");
    }
    
    public static double areaPerSlice(int diameter, int numslices) {
        int r = diameter/2;
        
        double areapizza = Math.PI*r*r;
        double areaslice = areapizza/numslices;
        return areaslice;     
        
    }
    
    
}

