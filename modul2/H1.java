package modul2;
class H2
{
	static void retryLogic()
	{
		System.out.println("RetryLogic");
	}
	static void excelDatafetching()
	{
		System.out.println("Data Fetching");

	}
}
public class H1 extends H2
{
	static void testcase1_LoginToAMazon()
	{
		System.out.println("LOgin to Amazon with vaid data");
	}
	public static void main(String[] args) 
	{
		excelDatafetching();
		testcase1_LoginToAMazon();
		retryLogic();
	}
}
