package ooppss;

public class Method_Overloadinggg {
	
public void show(int a,int b)
{
	System.out.println(a+ "  "+b);
	
}
	public void show(int a)
	{
		System.out.println(a);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method_Overloadinggg obj=new Method_Overloadinggg();
obj.show(2,4);
obj.show(3);

	}

}
