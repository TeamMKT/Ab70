package module1;
public class GlobalVariable1 
{
	static int a=500;//global varibale
	static int b=100;//global varibale
	int z=90;//instance variable
	static void add()            //Static Method
	{
		a=300;//this is how u update the value of global variable in case it is static
		int sum=a+b;//local varibale
		System.out.println("Answer is ->"+sum);
	}
	
		public static void main(String[] args) //Main Method
	{
			
			add();	
			GlobalVariable1 g1=new GlobalVariable1();
			System.out.println(g1.z);
			g1.z=100;////this is how u update the value of global variable in case it is instance
			System.out.println(g1.z);
			a=20;
			System.out.println(a);
			
	}
}
