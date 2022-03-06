package Assisted_project;
import java.util.*;
public class Collection {
	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Moradabad");//
	      city.add("Delhi");    	   
	      System.out.println(city);  
		
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(150); 
	      vec.addElement(305); 
	      System.out.println(vec);
		
		
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Raj");  
	      names.add("Jatin");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(1015);  
	       set.add(1038);  
	       set.add(1026);
	       set.add(1047);
	       System.out.println(set);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(118);  
	       set2.add(139);  
	       set2.add(126);
	       set2.add(143);	       
	       System.out.println(set2);
	      	} 
	      }  
	}



