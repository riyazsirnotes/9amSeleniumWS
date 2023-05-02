package may2nd;

import java.util.Scanner;

public class VoteApp {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Voting app ...");
		
		System.out.println("Enter your age :" );
		
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
		
		if(age>18)
		{
			System.out.println("you are eligible for voting ..happy voting..");
		}
		else
		{
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				e.printStackTrace();
			}
		}

		
		System.out.println("End of Program...");
	}

}
