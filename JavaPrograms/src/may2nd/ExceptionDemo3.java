package may2nd;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
