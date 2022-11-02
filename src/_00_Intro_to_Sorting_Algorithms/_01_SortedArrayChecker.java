package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
	/*
	 * Write a static method called intArraySorted.
	 *
	 * This method takes in an array of integers and it returns a boolean. The
	 * method returns true if the integer array is in ascending order and false
	 * otherwise.
	 */
	public static boolean intArraySorted(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

			for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= arr[i + 1]) {
				System.out.println(arr[i]);

			}
			
		}
		

		return false;

	}

	/*
	 * 2. Write a static method called doubleArraySorted.
	 *
	 * This method takes in an array of doubles and it returns a boolean. The method
	 * returns true if the double array is in ascending order and false otherwise.
	 */
	public static boolean doubleArraySorted(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] < arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= arr[i + 1]) {
				return true;
			}
		}
		
		return false;
	}

	/*
	 * 3. Write a static method called charArraySorted.
	 * 
	 * This method takes in an array of characters and it returns a boolean. The
	 * method returns true if the character array is in alphabetical order and false
	 * otherwise (You can compare characters just like integers).
	 */
public static void charArraySorted(char[] arr) {
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr.length - 1; j++) {
			
			if(arr[j] > arr[j+1]) {
				char temp = arr[j];  //temp equals current(3)
				arr[j] = arr[j+1];   //current(3) equals ahead(1)
				arr[j+1] = temp;    //ahead(1) equals temp   {current(3)}
				
				//if current is greater than ahead
			}
			
		}
		
	}
	
	
	
}
	/*
	 * 4. Write a static method called stringArraySorted.
	 *
	 * This method takes in an array of Strings and it returns a boolean. The method
	 * returns true if the String array is in alphabetical order and false otherwise
	 * (Use the compareTo(String) method).
	 */

}
