package module1;
public class StaticMethods2 
{
	static void add()            //Static Method
	{
		 int a=100;//local varibale
		int b=200;//local varibale
		a=900;//this is how you can update the value of local variable
		int sum=a+b;//local varibale
		System.out.println("Answer is ->"+sum);
	}

		public static void main(String[] args) //Main Method
	{
			add();	
	}
}
