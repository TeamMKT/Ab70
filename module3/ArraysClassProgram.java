package module3;

import java.util.Arrays;

public class ArraysClassProgram 
{
	public static void main(String[] args) {
/*
 * datatype [] variable=new datatype[size];
or
datatype variable []=new datatype[size];
 */
		int [] rollno=new int[4];
	    /*Array follow indexing
         * store duplicates
         * store null
         * only homogenious
         * they are known for its fixed size         
         * 
         */
		rollno[0]=12;
		rollno[1]=16;
		rollno[2]=14;
		rollno[3]=19;

		System.out.println(Arrays.toString(rollno));
		String [] name=new String[4];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Jagdish";
		name[3]="Salin";
		System.out.println(Arrays.toString(name));

		double [] salary=new double[4];
		
		salary[0]=12.5;
		salary[1]=18.5;
		salary[2]=11.5;
		salary[3]=10.9;
		
		System.out.println(Arrays.toString(salary));



	}
	
}
