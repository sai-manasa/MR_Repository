import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to reverse1:");
		String input=sc.nextLine();
		
		if(input.isEmpty()){
			System.out.println("you entered nothing to revere");
		}
	//	String input="Manu is a smart girl";
		
		else
		{
			
		
		String regex=" ";
		String words[]=input.split(regex);
		String revop=" ";
		//System.out.println(words.length);
		int totalwords=words.length;
		StrinRev strrev=new StrinRev();
		System.out.println("Given String ---->"+input);
		
		for(int i=(totalwords-1);i>=0;i--)
		{
			String op = null;
			//System.out.println(words[i]);
			try{
			if("love".equals(words[i].toString())){
				System.out.println("test");
				 op=	strrev.revString(null);
			}
			 op=	strrev.revString(words[i]);
			}catch(NullPointerException ne){
				System.out.println("i wont do it");
			}
			//System.out.print(op+" ");
			String sop=op+" ";
			revop=revop.concat(sop);
			
		}
		System.out.println();
	System.out.println("After reverse---->"+revop);

	}
	}
}


