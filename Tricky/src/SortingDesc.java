
public class SortingDesc {

	public static void main(String[] args) {
		int num[]={1,5,8,9,7};
		int temp;
		System.out.println("length"+num.length);
		
		for(int i=0;i<num.length;i++)
		{
			//System.out.println(num[i]);
			for(int j=(i+1);j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int k=0;k<num.length;k++)
		{
			System.out.println(num[k]);
		}

	}

}
