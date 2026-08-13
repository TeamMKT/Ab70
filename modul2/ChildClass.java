package modul2;

public class ChildClass extends ParentClass
{
	
	static void tc_AddingTheProductToCart()
	{
		System.out.println("AddingTheProductToCart");
	}
	public static void main(String[] args) 
	{
		loinCode();
		tc_AddingTheProductToCart();
		
		ChildClass c1=new ChildClass();//WIth the help of this u can access the
		//non static methods of parent as well of your child
		//with this help u can also access instance variables of parent as well as
		//of your child class
		c1.screenShot();
		System.out.println(a);
		
	}
}
