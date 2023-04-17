package apr7th;

public class Bank {

	private double balance = 10000.00;
	
	//to get or retrieve the balance
	//getter method
	public double getBalance(int pin,int otp)
	{
		// validation 
		if(pin == 3214 && otp == 987654)
		{
		return balance;
		}
		else
		{
			System.out.println("Entered Invalid Pin");
			return 0.0;
		}
	}
	
	//to modify the balance
	//setter
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
