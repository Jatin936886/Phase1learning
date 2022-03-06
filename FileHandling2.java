package Assisted_project;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling2 {
 public static void main(String[] args){
 // Append text to Existing File.
 String path = "C:\\Users\\jatin\\Practice Project\\Harshit.txt";
 String text = " Currently doing training at Simplilearn";
 try
 {
 FileWriter f = new FileWriter(path,true);
 f.write(text);
 f.close();
 System.out.println("Append done Successfully..");
 }
 catch(IOException e){
 System.out.println(e);
 } 
 }
}
