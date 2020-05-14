
/*
 * 11.	Write a class named Assignment11 that uses a double for-loop (a for-loop within a for-loop). 
 * The outer loop should navigate through an integer array that has 10 elements corresponding to the numbers 1 through 10, 
 * inclusive. 
 * 
 * The inner loop should count from 1 to 10, and prints the value of the current count multiplied by a the current index 
 * of the array. 
 * 
 * You should end up printing the multiples of 1 through 10 from 1 to 10. Ex: 1*1, 1*2, 1*3…1*10, 2*1, 2*2, 2*3…10*9, 10*10.
 */

public class Assignment11 {
	
	public static void main(String[] args) {
		
		int[] intArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i);
			
			for(int j = 1; j <= 10; j++) {
				int result = intArray[i] * j;
				System.out.println(result);

			} // end inner for
		} // end outer for
	} // main

}
