package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	
    	String[] words = {"hello", "hi", "hallo", "hai"};
    	String value = "hallo";
    	int index = _01_LinearSearch.linearSearch(words, value);
        assertEquals(2, index);
    }
    @Test
    public void testLinearSearchFailure() {
    	
    	String[] words = {"hello", "hi", "hallo", "hai"};
    	String value = "joe";
    	int index = _01_LinearSearch.linearSearch(words, value);
        assertEquals(-1, index);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] array =  {1, 2, 3, 4, 5, 6, 7};
    	int start = array[0];
    	int end = array[array.length-1];
    	int value = 3;
    	int index = _02_BinarySearch.binarySearch(array, start, end, value);
        assertEquals(3, index);
    }
    @Test
    public void testBinarySearchFailure() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] array =  {1, 2, 3, 4, 5, 6, 7};
    	int start = array[0];
    	int end = array[array.length-1];
    	int value = 999;
    	int index = _02_BinarySearch.binarySearch(array, start, end, value);
        assertEquals(-1, index);
    }
}
