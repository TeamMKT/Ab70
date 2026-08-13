package module1;
public class NonStaticMethods 
{
	 void add()            //Non Static Method
	{
		System.out.println("Static Method 1");
	}
	void sub()//Non Static Method
	{
			System.out.println("Static Method 2");
	}
		public static void main(String[] args) //Main Method
	{
		
			NonStaticMethods n1=new NonStaticMethods();
			n1.add();
			n1.sub();
			n1.sub();
	/*		NonStaticMethods n2=new NonStaticMethods();
		n2.add();
		n2.sub();
	*/		
			
	}
}
