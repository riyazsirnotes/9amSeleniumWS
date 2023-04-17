package apr10th;

public class ClockDemo {

	public static void main(String[] args) {
		//user1
		
		Clock obj1=new Clock();
		obj1.setClock(10);
		obj1.getClock();
		
		//user 2
		
		Clock obj2=new Clock();
		obj2.setClock(10, 12);
		obj2.getClock();
		

	}

}
