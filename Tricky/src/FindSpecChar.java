
public class FindSpecChar {

	public int findSpeci(String inputstr)
	{
		int windex=-1;
		for(int i=0;i<inputstr.length();i++)
		{
			//g o @ d
			 // 0 1 2 3
			char ch=inputstr.charAt(i);
			//System.out.println(i+" character "+ch);
			if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'
					||ch=='&'||ch=='*'||ch=='('||ch==')')
			{
				windex=i;
				System.out.println("special char is "+ch);
				//System.out.println("Specail char found at "+i+" positon char is "+ch);
				//break;
			}
			
		}
		return windex;
	}
}
