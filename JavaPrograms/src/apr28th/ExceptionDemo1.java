package apr28th;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value for x : ");
		//Thread.sleep(3000);
		int x=in.nextInt();
		System.out.println("Enter value for y : ");
		int y=in.nextInt();
		
		try
		{
		int z=x/y;
		
		System.out.println("Quotient is "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Enter non-zero value for y");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			System.out.println("In Finally block");
		}
		
		
		
		System.out.println("End of Program");

	}

}
