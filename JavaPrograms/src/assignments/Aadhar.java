package assignments;

public class Aadhar {
	
	public Aadhar(String panNo)
	{
		printAadhar();
	}
	
	public Aadhar(String panNo,String passportNo)
	{
		printAadhar();
	}
	
	public void printAadhar()
	{
		System.out.println((int)(Math.random()*10000)+" "
				+(int)(Math.random()*10000)+" "
				+(int)(Math.random()*10000));
	}

}
