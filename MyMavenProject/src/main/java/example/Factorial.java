package example;

public class Factorial {

	public int dimm(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			
		}
		return fact;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial obj=new Factorial();
System.out.print(obj.dimm(5));
	}

}
