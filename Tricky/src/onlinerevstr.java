import java.util.Scanner;

public class onlinerevstr {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        
        char[] letters = scanner.nextLine().toCharArray();
       /* System.out.println("letters length "+letters.length);
        
        for(int j=0;j<letters.length - 1;j++)
        {
        	System.out.println(letters[j]);
        }*/
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
