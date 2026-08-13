package module3;
//WAP to add all the numers present in array also find out its average
public class ArrayAverage 
{
	public static void main(String[] args) 
	{
		double [] number=new double[4];
		number[0]=10;
		number[1]=30;
		number[2]=20;
		number[3]=10;
		double sum=0;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
			/*0,sum=10
			 * 1,sum=40
			 * 2,sum=60
			 * 3,sum=70
			 * 
			 */
		}
		System.out.println(sum);

		double average=sum/number.length;
		System.out.println(average);
	}
}
