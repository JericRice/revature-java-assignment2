 // 8.	Write a class named Assignment8 which uses a do-while loop to print only the odd number between 1 and 9, inclusive.

public class Assignment8 {
	
	public static void main(String[] args) {
		
		int x = 1;
		
		do {		
			if (x %2 == 1) {
				System.out.println(x);			
			} x++;
		} while (x < 10);
	}
}
