package apr12th;

public class Student {
	
	int rollNo;
	
	String sNa;
	
	public void setDetails(int rollNo,String sNa)
	{
		this.rollNo=rollNo;
		
		this.sNa=sNa;
		
	}
	
	public void getDetails()
	{
		System.out.println("Roll No : "+rollNo+"\t Student Name : "+sNa);
	}
	

}
