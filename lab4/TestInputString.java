import java.util.Scanner;

public class TestInputString {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		/*System.out.print("Enter two words separated by spaces: ");
		String s1 = input.next();
		String s2 = input.next();
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);*/
		
		/////////////////////////////////////////////
		
		System.out.println("Enter a line: ");
		String s = input.nextLine();
		System.out.println("The line entered is " + s);


	}
}