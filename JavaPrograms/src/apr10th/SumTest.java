package apr10th;

public class SumTest {

	public static void main(String[] args) {
		
		Sum obj1=new Sum();
		
		obj1.add(10, 20);
		
		//obj1.addDouble(10.22, 20.33);
		obj1.add(10.22, 20.33);
		
		//obj1.addLong(1100022000l, 3300044000l);
		obj1.add(1100022000l, 3300044000l);
		
		obj1.add(10, 20, 30);

	}

}
