package module3;
class Information
{
	private double z=100;
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	private	int age=50;//40

	public int getAge()
	{
		return age;
		
	}
	public void setAge(int age)
	{
		this.age=age;//assiging the local age to global age
	}	
	
	private String name="Ram";
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}


}
public class EncapsulationProgram 
{
	public static void main(String[] args) 
	{
		Information i1=new Information();
		i1.setAge(40);
		System.out.println(i1.getAge());
		
		i1.setName("Vishnu");
		System.out.println(i1.getName());

	}
}
