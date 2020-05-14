import java.lang.reflect.Array;

/*
 * 10.	Write a class named Assignment10 that uses a for-loop to navigate through an array of 10 double numbers 
 * and prints each element of the array. 
 */

public class Assignment10 {
	
	public static void main(String[] args) {
		
		 double[] doubleArray = new double[]{ 1.2,2.3,3.5,4.6,5.8,6.2,7.2,8.6,9.9,10.1 }; 
		
		 for (double i = 0; i < doubleArray.length; i++) {
			 System.out.println("Element at index " + i + ": " + doubleArray[(int) i]); // need to cast to int
		 }
			 

		
	}

}
