package apr5th;

public class MethodsDemo2 {

	public static void main(String[] args) {
	
		MethodsDemo2 obj1=new MethodsDemo2();
		
		obj1.sumOfNaturalNumbers(5);
		obj1.sumOfNaturalNumbers(10);
		obj1.sumOfNaturalNumbers(100);
		obj1.sumOfNaturalNumbers(1000);

	}
	
	public void sumOfNaturalNumbers(int num)
	{
		int res=0;
		
		for(int i=1;i<=num;i++)
		{
			res=res+i;
		}
		
		System.out.println("Sum of "+num+" natural numbers is "+res);
		
	}

}
