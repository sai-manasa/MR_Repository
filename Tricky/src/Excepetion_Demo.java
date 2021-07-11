
public class Excepetion_Demo {

	public static void main(String[] args)  {
   
		
		 String s1="Manasa",s2="mansa";
		 if(s1.equals(s2))
		 {
			 System.out.println("strings r equal");
		 }
		 else
		 {
			// throw new Error("Strings not equal "+s1+" "+s2);
			 try {
				 throw new Error("Strings not equal "+s1+" "+s2);
			} catch (Throwable e) {
				System.out.println(e.getMessage());
			}
			 
		 }
		/* c=a/b;
		 System.out.println(c);*/
		 

	}

}
