package squarenCuberoot;

import java.util.Scanner;

public class Cubensquare {
	
    public static double calculateSqrt (int n) {
        
    double rootValue = 1.00;
    double num = n;
     
    for (int i = 0; i < n; i++) {
         
        rootValue = 0.5 * (rootValue + num/rootValue);
    }   
     
    int returnValue = (int)(rootValue * 1000);  
    rootValue = returnValue;
    rootValue /=1000;
    System.out.println("Root Value Calculated : " + rootValue); 
    return rootValue;
    }
    public static double calculateCubeRoot (double y){
    	
    	System.out.println("Cube Root Value Calculated : "+Math.cbrt(y));
		return y;
    	
    }
	public static void main(String[] args) {
		
		int n;
        
        @SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);        
         
        System.out.println("Enter Number to find square Root :");
        n = input.nextInt();    
         
        calculateSqrt(n);
        
        System.out.println("Enter Number to Find Cube Root :"); 
        
        double y = input.nextDouble();
        
        calculateCubeRoot(y);
        
	}

}
