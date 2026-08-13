package module3;
public class CountOfAlphaNumericSpaceSpecial 
{
	static int countOfAlpha=0;
	static int countOfNumber=0;
	static int countOfSpace=0;
	static int countOfSpecialCh=0;

	public static void main(String[] args) 
	{
		String a="auto123 manual ^%$ &^";
		
		char [] c1=	a.toCharArray();
		
	for(int i=0;i<c1.length;i++)
	{
		boolean b1=Character.isAlphabetic(c1[i]);
		if(b1==true)//if(b1)or if(Character.isAlphabetic(c1[i])) or if(Character.isAlphabetic(c1[i])==true)
		{
			countOfAlpha++;
		}
		boolean b2=Character.isDigit(c1[i]);
		if(b2==true)
		{
			countOfNumber++;
		}
		boolean b3=Character.isWhitespace(c1[i]);
		if(b3==true)
		{
			countOfSpace++;
		}
	/*	if(!b1 && !b2 && !b3)
		{
			countOfSpecialCh++;
		}
*/
	}	
	System.out.println("TotalCount of alphabets->  "+countOfAlpha);
	System.out.println("TotalCount of Number-> " +countOfNumber);
	System.out.println("TotalCount of Spaces->  "+countOfSpace);
	
	
	countOfSpecialCh=a.length()-(countOfAlpha+countOfNumber+countOfSpace);
	System.out.println("TotalCount of Special char->  "+countOfSpecialCh);

	}
}
