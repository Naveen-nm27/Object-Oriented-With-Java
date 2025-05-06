import java.util.Scanner;

public class MainApp {
	public static void main(String[] args){

		
		Scanner uin = new Scanner(System.in);
		
		System.out.println("Enter num#1");
		double num1 = uin.nextDouble();
		
		System.out.println("Enter num#2");
		double num2 = uin.nextDouble();
		
		uin.nextLine();
		
		System.out.println("Enter the Arithmetic Operation | + | * | - | / | : ");
		char OPT = uin.next().charAt(0);
		
		double num3 = 0;

		switch (OPT) {
				case '+':
					num3 = num1 + num2;
					break;
				case '-':
					num3 = num1 - num2;
					break;
				case '*':
					num3 = num1 * num2;
					break;
				case '/':
					num3 = num1 / num2;
				default:
					System.out.println("You Entered Wrong Input");
		}
		
		System.out.println("The final result:");
		System.out.println();
		
		System.out.println(num1 + " " + OPT + " " + num2 + "=" + num3);
		
	}
}
