package ooppss;

public class Mthd_riding {
	
	public float sam(int a,float b) {
		float c=a+b;
		return c;
	}
	public  float sam1(float a,int b) {
		float d=a-b;
		return d;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
Mthd_riding obj=new Mthd_riding();
System.out.println(obj.sam(5, 3.0f));
System.out.println(obj.sam1(6.0f, 2));
	}

}
