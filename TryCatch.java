package Assisted_project;

public class TryCatch {
	public static void main(String args[]) 
    {
        int[] array = new int[8];
        try 
        {
            array[7] = 8;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
	
}
