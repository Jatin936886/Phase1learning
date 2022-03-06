package Phase1.Project;
import java.awt.Desktop;
import java.lang.NullPointerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class OptionOperation implements Files{
	List<String>StoredFiles = new ArrayList<String>();
	File[] files = new File("C:\\Users\\jatin\\Main Project").listFiles();
	private Scanner scan;
	private Scanner scan2;
	private Scanner scan3;
	private Scanner sc1;
	@Override
	public void showAllFiles(){
		for(File filesln : files){
			if(filesln.isFile()){
				StoredFiles.add(filesln.getName());
			}
			
		}
		for(int i=0;i<StoredFiles.size();i++){
			System.out.println(StoredFiles.get(i));
		}
		
	}
	@Override
	public void addFile(){
		System.out.println("Enetr the files which you want to add:");
		scan = new Scanner(System.in);
		String fileName = scan.nextLine();
		File F = new File(fileName);
		try{
			if(F.createNewFile()){
				System.out.println(fileName+"file is added");
				Desktop.getDesktop().edit(F);
			}
			else{
				System.out.println("files is there already");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	@Override
	public void deleteFile(){
		System.out.println("Enter the files that you want to delete:");
		scan2 = new Scanner(System.in);
		String fileNmae = scan2.nextLine();
		File F = new File(fileNmae);
		if(F.delete())System.out.println(fileNmae+" is deleted");
		else
			System.out.println("File not found");
	}
	@Override
	public void searchFile(){
		try{
			scan3 = new Scanner(System.in);
			File directory = new File("C:\\Users\\jatin\\Main Project");
			System.out.println("Enter the file name that you want to search:");
			String fileName = scan3.nextLine();
			File[] files = directory.listFiles();
			int flag=0;
			for(File file : files){
				String name = file.getName();
				if(name.equals(fileName)){
					//System.out.println("the filename "+fileName+" is present in the directory");
					File f = new File(fileName);
					sc1 = new Scanner(f);
					while(sc1.hasNextLine()){
						System.out.println(sc1.nextLine());
					}
					flag = 1;
				}
				
			}
			if(flag==0){
				System.out.println("file does not found");
			}
		}
		catch(FileNotFoundException ex){
			System.out.println("File not found");
		}
	}
	
}
