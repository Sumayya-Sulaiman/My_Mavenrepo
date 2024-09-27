package ooppss;

public class HierarchialC extends HierarchialA
{
public void hirc() {
	System.out.println("happyykid");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialC obj=new HierarchialC();
		obj.hirc();
		obj.hir();
		HierachialB obj1=new HierachialB();
		obj1.hirr();
		obj1.hir();
	}

}
