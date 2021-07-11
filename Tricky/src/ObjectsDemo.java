
public class ObjectsDemo {

	public static void main(String[] args) {
		Object obj[]=new Object[5];
		obj[0]=123;
		obj[1]="Manasa";
		obj[2]=56.78;
		obj[3]=true;
		obj[4]='m';
		System.out.println(obj.length);
		
		for(Object o:obj)
		{
			System.out.println(o);
		}
	}

}
