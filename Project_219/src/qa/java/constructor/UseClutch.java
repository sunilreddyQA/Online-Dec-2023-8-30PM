package qa.java.constructor;

public class UseClutch 
{
	public UseClutch() 
	{
		System.out.println("Holding Clutch");
	}
	
	
	public void changetofirst() 
	{
		System.out.println("first gear is selected");
	}
	
	public void changetosecond()
	{
		System.out.println("second gear is selected");
		
	}
	
	public static void main(String[] args) 
	{
		new UseClutch().changetofirst();
		new UseClutch().changetosecond();
		
	}

}
