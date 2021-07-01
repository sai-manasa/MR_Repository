
public class SpecialChar {

	public static void main(String[] args) {
		
		FindSpecChar fsc=new FindSpecChar();
		
		int index=-1;
		String inpustr="Manasa is a g@d girl";
		
	//	System.out.println(inpustr.length());
		
		String regex=" ";
		String[] words=inpustr.split(regex);
		System.out.println("total words "+words.length);
		
		for(int i=0;i<words.length;i++)
		{
			String eachword=words[i];
			//System.out.println((i+1)+" word "+eachword);
			int res=fsc.findSpeci(eachword);
			if(res>=0)
			{
				System.out.println("special character  is present in "+(i+1)+ " word ");
			}
		}
		//System.out.println(words[0]+" "+words[1]);
		
		
		
	}
	
	

}
