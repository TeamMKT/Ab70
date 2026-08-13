package modul2;
abstract class L2        //This is what we are going to expose to 3rd party companies
{
	abstract void login();//this is a abstarct method
////This is what we are going to expose to 3rd party companies
}
public class L1 extends L2
{
	public static void main(String[] args) 
	{
		
	}

	void login() 
	{
		System.out.println("Here Developer can write teh code-within the company");
	}
}
