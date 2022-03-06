package Assisted_project;

public class AreaCalculation 
{
	double rad;
	int len;
	int bre;
	int sidelen;
	public AreaCalculation ()
	{
		System.out.println("calculating area of different shapes");
	}
	public AreaCalculation (double radius)
	{
		rad=radius;
		
	}
	public AreaCalculation (int len,int bre)
	{
		this.bre=bre;
		this.len=len;
		
	}
	public AreaCalculation (int side)
	{
		sidelen=side;
	}
	public static void main(String[] args) throws Exception
	{
		AreaCalculation  a1=new AreaCalculation ();
		AreaCalculation  circle=new AreaCalculation (7.6);
		AreaCalculation  square=new AreaCalculation (8);
		AreaCalculation  rectangle=new AreaCalculation (9,8);
		System.out.println("area of square is :"+square.squareArea(square.sidelen));
		System.out.println("area of rectangle is :"+rectangle.rectangleArea(rectangle.bre,rectangle.len));
		System.out.println("area of circle is "+circle.circleArea(circle.rad));
	}
	double circleArea(double x)
	{
		return 3.14*x*x;
	}
	double squareArea(int s)
	{
		return (double)s*s;
	}
	int rectangleArea(int x,int y)
	{
		return x*y;
	}
}