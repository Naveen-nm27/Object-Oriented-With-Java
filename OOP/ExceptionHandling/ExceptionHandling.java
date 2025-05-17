import java.util.*;

class ExceptionHandling{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the num1: ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the num2: ");
			int num2 = sc.nextInt();
			
			int num3 = (num1 / num2);
			System.out.println("Answer is: " + num3);
			
		}
		
		catch (Exception e){
			System.out.println("Error");
		}
	}
	
}
