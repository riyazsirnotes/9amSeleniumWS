package apr7th;

public class Customer {

	public static void main(String[] args) {
		
		Bank c1=new Bank();
		
		//System.out.println("Balance is "+c1.balance);
		
		System.out.println("Balance is "+c1.getBalance(3214,987654));
		
		c1.setBalance(2000.00);
		
		System.out.println("Balance is "+c1.getBalance(3214,987654));

	}

}
