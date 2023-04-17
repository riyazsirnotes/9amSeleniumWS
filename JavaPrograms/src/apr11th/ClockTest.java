package apr11th;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		
		Clock obj1=new Clock();
		obj1.getClock();
		
		//user 2
		
		Clock obj2=new Clock(9);
		obj2.getClock();
		
		//user 3
		
		Clock obj3=new Clock(9,51);
		obj3.getClock();
		
		//user 4
		
		Clock obj4=new Clock(9,52,45);
		
		obj4.getClock();

	}

}
