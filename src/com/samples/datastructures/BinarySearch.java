package com.samples.datastructures;


/**
 * The intention of the binary search is to search the index of the given string/number.
 * If the value exists it will find otherwise , it will return -1
 * 
 * Important condition is array to be sorted while giving.
 * 
 * @author Rajesh
 *
 */
public class BinarySearch {

	public static void main(String[] args) 
	{
		
		int[] numbers = new int[] {1, 4, 6, 13, 15, 18, 19, 25, 30, 40, 51, 62, 73, 86} ;
		
		int elementIndex = binarySearch(numbers, 1, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 4, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 6, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 13, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 15, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 18, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 19, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 25, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 30, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 40, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 51, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 62, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
        elementIndex = binarySearch(numbers, 73, 0, numbers.length - 1) ;
		System.out.println("Element Index : " + elementIndex);
		
		 elementIndex = binarySearch(numbers, 86, 0, numbers.length - 1) ;
			System.out.println("Element Index : " + elementIndex);
		

	}

	private static int binarySearch(int[] numbers, int element, int lhs, int rhs) 
	{
		while(lhs <= rhs)
		{
		   int mid = lhs + (rhs-lhs)/ 2 ;
		   
		   if(numbers[mid] == element)
		   {
			   System.out.println("Hurray Element Found.");
			   
			   return mid ;
		   }
		   else if(numbers[mid] < element)
		   {
			   mid = mid + 1 ;
			   lhs = mid ;
		   }
		   else if(numbers[mid] > element)
		   {
			   mid = mid - 1 ;
			   rhs = mid ;
		   }
		}  
	   
		
		return -1 ;
	}

}
