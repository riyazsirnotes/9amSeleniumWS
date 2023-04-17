package apr13th;

public class B extends A{
	
	int x;
	
	public B()
	{
		
		System.out.println("This is B's constructor");
	}
	
	public void putX(int x)
	{
		this.x=x;
		
	}
	
	public void displayAll()
	{
		
		System.out.println(" x is "+super.x);
		
		System.out.println(" x is "+this.x);
	}
	
	public void m1()
	{
		super.m1();
		System.out.println("This is B's m1 method");
	}

}
