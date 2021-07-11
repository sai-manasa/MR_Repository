package LiveProject;

public class TwoDimenObj {

	public static void main(String[] args) {
		Object login[][]=new Object[3][2];
		login[0][0]="Manu";
		login[0][1]="1234";
		
		login[1][0]="Manasa";
		login[1][1]="123456";
		
		login[2][0]="MR";
		login[2][1]="55";
		
		System.out.println("row length "+login.length);
		
		for(int i=0;i<login.length;i++)
		{
			System.out.println((i+1)+" row-->- col lenth"+login[i].length);
		}
		
		for(int r=0;r<login.length;r++)
		{
			
			for(int c=0;c<login[r].length;c++)
			{
				System.out.print(login[r][c]+"     ");
			}
			System.out.println();
		}
		
		

	}

}
