package apr25th;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		a[0]=100;
		a[1]=200;
		a[2]=250;
		a[3]=300;
		a[4]=350;
		//a[5]=400;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
