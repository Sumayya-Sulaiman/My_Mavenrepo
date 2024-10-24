package review;

public class ClassA {
	
	public static  void show(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	
	
	public static void sam()
	{
		int a=5,b=2,c;
		c=a+b;
		System.out.println(c);
	}
	
	public static int dis()
	{
	int p=3,q=2;
	int r=p+q;
	return r;
	
	}
	
	
		public static int add2(int a,int b)
		{
			int c=a+b;
            return c;
		}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassA.show(1, 2);	
ClassA.sam();
System.out.println(ClassA.dis());
System.out.println(ClassA.add2(6, 5));

	}

}
