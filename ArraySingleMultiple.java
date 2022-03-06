package Assisted_project;

public class ArraySingleMultiple {
	public static void main(String[] args) {

		//single-dimensional array
		int a[]= {40,80,60,10,20};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {20, 45, 67, 84}, 
		            {37, 68, 93} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      }

}
