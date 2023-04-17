package apr5th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3.sumOfNaturalNumbers(5);
		MethodsDemo3.sumOfNaturalNumbers(10);
		MethodsDemo3.sumOfNaturalNumbers(100);
		MethodsDemo3.sumOfNaturalNumbers(1000);

	}
	
	public static void sumOfNaturalNumbers(int num)
	{
		int res=0;
		
		for(int i=1;i<=num;i++)
		{
			res=res+i;
		}
		
		System.out.println("Sum of "+num+" natural numbers is "+res);
		
	}

}
