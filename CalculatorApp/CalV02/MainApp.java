import java.util.Scanner;

class Calc{
	
	static void Add(double n1,double n2){
		double result = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = "  + result);
	}
	
	static void Subtract(double n1,double n2){
		double result = n1 - n2;
		
		System.out.println(n1 + " - " + n2 + " = " + result);
	}
	
	static void Multiply(double n1,double n2){
		double result = n1 * n2;
		
		System.out.println(n1 + " * " + n2 + " = " + result);
	}
	
	static void Devition(double n1,double n2){
		if (n2 == 0){
			System.out.println("Cannot be Devide by 0");
		} else {
			double result = n1 / n2;
		}
	}
	
}

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
					Calc.Add(num1,num2);
					break;
				case '-':
					Calc.Subtract(num1,num2);
					break;
				case '*':
					Calc.Multiply(num1,num2);
					break;
				case '/':
					Calc.Devition(num1,num2);
				default:
					System.out.println("You Entered Wrong Input");
		}
		
	
	
		
	}
}
