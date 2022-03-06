package Practice_Project;
import java.io.*;
public class FileHandling {
 public static void main(String[] args){
 
 try
 {
FileWriter f = new FileWriter("C:\\Users\\jatin\\Practice Project\\jj.txt");
 try
 {
 f.write("Jatin is the employee of multi national company ..!!");
 }
 finally
 {
 f.close();
 }
 System.out.println("Successfully Written..!! ");
 }
 catch(IOException i)
 {
 System.out.println(i);
 } 
 
 }
}
