package modul2;
abstract class V2              ////ABSTARCT Class
{
	 void searchFlight() //Concrete Method  //FREE API-BackLogic Logic for any application
	{
		System.out.println("This Logic will be exposed");
	}
	 abstract  void bookAPI(); //ABSTARCT Method
	 abstract  void cancelAPI(); //ABSTARCT Metho

}//Abstraction =67%[abstract class can help us achieve 0 to 100% abstraction]
public class V1 extends V2
{
	
	void bookAPI() 
	{
		System.out.println("Logic by developer1");
	}
	void cancelAPI() 
	{
		System.out.println("Logic by developer2");
	}
	public static void main(String[] args)
	{
		
	}

	
}
