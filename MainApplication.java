package Phase1.Project;
import java.util.Scanner;
public class MainApplication {
	private static void welcomeMsg(){
		System.out.println("\t\t\t\t\tApplication:LockedMe\n"+"\t\t\t\tdeveloper : Jatin\n");
		System.out.println("Enetr your choice which yoy wants to select : \n\t1.Show existing files \n\t2.Performance required operations\n\t3.Exit from the application\n");
	}
	private static void selectMenu(){
		OptionOperation operation = new OptionOperation();
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option){
		case 1:
			operation.showAllFiles();
			break;
		case 2:
			int ch;
		do{
			System.out.println("enter your choice for CRUD level operation");
			System.out.println("\t1.add a file");
			System.out.println("\t2.Delete a file");
			System.out.println("\t3.Search a file");
			System.out.println("\t4.Exit CRUDS menu");
			ch=sc.nextInt();
			switch(ch){
			case 1:
				operation.addFile();
				break;
			case 2:
				operation.deleteFile();
				break;
			case 3:
				operation.searchFile();
				break;
			case 4:
				System.out.println("Exited from the CRUDS operation.........");
				System.out.println("............................................");
				break;
				default:
					System.out.println("invalid choice number");
					break;
			}
		 }
		while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the Application");
			System.exit(0);
			break;
		default:
			System.out.println("Inavlid choice");
		}
		selectMenu();
	}
	public static void main(String[] args){
		welcomeMsg();
		selectMenu();
	}

}
