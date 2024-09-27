package ooppss;

public class SumandMin_ovrRiding {
	
	
	
	public void sam(int a,float b) {
		float c=a+b;
	System.out.println(c);	
	}
	public  void sam1(float a,int b) {
		float d=a-b;
		System.out.println(d);
	}

	public static void main(String[] args) {

		SumandMin_ovrRiding obj=new SumandMin_ovrRiding();
obj.sam(5, 3.0f);
obj.sam1(6.0f, 2);
	}

}

