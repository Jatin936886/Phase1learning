package Assisted_project;

class A{  
	private int data=40;  
	
	private void msg()
	{
		System.out.println("Hello java");
	}  
}  
  
public class PrivateMethod{  
 
  public static void main(String args[]){  
   A obj=new A();  
   //System.out.println(obj.data);//Compile Time Error  
   //obj.msg();//Compile Time Error  
   }  
}  