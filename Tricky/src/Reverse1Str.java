import java.util.Scanner;

public class Reverse1Str {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to reverse1:");
		String input=sc.nextLine();
		
		if(input.isEmpty()){
			System.out.println("you entered nothing to revere");
		}
		
		else
		{
		String regex=" ";
		String words[]=input.split(regex);
		String revop=" ";
		int totalwords=words.length;
		System.out.println("Given String ---->"+input);
		
		StrinRev strrev=new StrinRev();
		
		for(int i=(totalwords-1);i>=0;i--)
		{
			String op = null;
			//System.out.println(words[i]);
			try{
				 op=strrev.revString(words[i]);
			
			
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
