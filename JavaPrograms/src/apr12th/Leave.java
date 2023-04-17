package apr12th;

public class Leave extends Marks {
	
	int sl,cl;
	
	public void setLeaves(int sl,int cl)
	{
		this.sl=sl;
		this.cl=cl;
	}
	
	
	public void getLeaves()
	{
		System.out.println("No of Leaves taken : "+(sl+cl));
	}
	
	public void getDetails()
	{
		System.out.println("Roll no : "+rollNo);
		System.out.println("******************");
		System.out.println("Student Name : "+sNa);
	}

}
