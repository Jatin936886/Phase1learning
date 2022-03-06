package Practice_Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
	public static void main(String[] args){
		List<String>email = new ArrayList<String>();
		email.add("jatin@.com");
		email.add("rashmi.singh@.com");
		email.add("ramesh@example.me.org");
		email.add("king.example.com");
		email.add("raj.example.com");
		for(String value:email){
			System.out.println("the Email addresss" +value+" is"+(isValidEmail(value)?"valid":"invalid"));
			
		}
		System.out.println("Enter any email address to check");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("the Email address"+input+"is"+(isValidEmail(input)?"valid" : "invalid"));
		
		
	}
	public static boolean isValidEmail(String email){
		String regex="^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
		}

}
