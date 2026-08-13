package modul2;
abstract class B6        ////Abstract Class
{
	abstract void loginLogic(); //Abstract Method
	abstract void registrationLogic();//Abstract Method

}//Abstraction =100%[abstract class can help us achieve 0 to 100% abstraction]
public class B1 extends B6          ////Concrete Method
{
	void loginLogic()                    //Concrete Method
	{
	System.out.println("LOgic by Developer 1");	
	}
	void registrationLogic()                 //Concrete Method
	{
		System.out.println("LOgic by Developer 2");	
	}
	public static void main(String[] args)           //Concrete Method
	{
		
	}
}
