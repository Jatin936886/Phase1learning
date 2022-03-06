package Assisted_project;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
 public static void main(String[] args){
 //Writing in the file
 
 try
 {
FileWriter f = new FileWriter("C:\\Users\\jatin\\Assisted practice project\\Harshit.txt");
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