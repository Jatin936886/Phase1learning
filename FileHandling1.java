package Assisted_project;
import java.io.FileReader;
import java.io.IOException;
public class FileHandling1 {
	 public static void main(String[] args){
		 //Reading an Existing file
		 try
		 {
		 FileReader r = new FileReader("C:\\Users\\jatin\\Practice Project\\Harshit.txt");
		 try
		 {
		 int i;
		while((i=r.read())!=-1)
		 {
		 System.out.print((char)i);
		 }
		 }
		 finally
		 {
		 r.close();
		 System.out.print("\n");
		 System.out.print("File Closed successfully.");
		 }
		 }
		 catch(IOException e)
		 {
		 System.out.println("Exception handled..");
		 }
		 }
		}
