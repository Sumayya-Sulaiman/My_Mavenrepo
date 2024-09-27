package fact;

public class Factorial
{
	
	
	public int fact(int a)
	{
	int fac=1;
	
		for(int i=1;i<=a;i++) 
		{
			fac=fac*i;
		return fac;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial obj=new Factorial();
obj.show(5);
	}

}
