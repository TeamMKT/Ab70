package module3;
class A3
{
	
}
class A2 extends A3
{
	
}
public class A1 extends A2
{
	public static void main(String[] args)
	{
		A3 a1=new A2();
		//only a3 [rop u can access
		
	A2 a3=(A2)a1;
	//only a2 and a3 prop
	
		
	}
}
