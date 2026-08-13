package module1;
public class GlobalVariableProgram 
{
	static int a=900;//Global 
	public static void main(String[] args) 
	{
		int a=100;//local
		
		System.out.println(a);
		System.out.println(GlobalVariableProgram.a);
	}
}
