
public class StrinRev {
	
	
	public String revString(String word) throws NullPointerException
	{
		int wlen=word.length();
		char[]  output = new char[wlen];  
		
		
		String temp;
		int slen=word.length()-1;
		
		
		for(int i=0;i<=slen;i++)
		{
			char ch=word.charAt((slen-i));
		
			output[i]=ch;
			
			
		}
	String res=	String.valueOf(output);
	
	return res;
		
	}
}
