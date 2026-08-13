package module3;

public class StudentDetailsProgram 
{
	
	int rollno;
	String name;
	double information;
	void stddetail(int a,String b,double c)
	{
	/*
	 * this.globalvariable=localvariable;
	 */
		this.rollno=a;
		this.name=b;
		this.information=c;
	}
	public static void main(String[] args) 
	{
		StudentDetailsProgram s1=new StudentDetailsProgram();
		s1.stddetail(12,"Ram", 90.6);
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.information);

	}
}
