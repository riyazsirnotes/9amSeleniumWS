package apr13th;

public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers obj1=new Sum();
		
		obj1.compute(10, 20);
		
		obj1.greet();
		
		Numbers obj2=new Sub();
		
		obj2.compute(20, 30);

	}

}
