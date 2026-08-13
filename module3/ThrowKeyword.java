package module3;
public class ThrowKeyword 
{
	public static void main(String[] args) throws NullPointerException,ArithmeticException, InterruptedException
	{
		/*Useful in  throwing an exception
		 * 
		 */

		if(1==2)
		{
		throw new NullPointerException();
		}
		else
		{
		throw new ArithmeticException();
		}
		
		
	}
}
