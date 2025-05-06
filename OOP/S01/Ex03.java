import java.util.Scanner;

public class Ex03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Subjuct 01 Marks: ");
		double m1 = sc.nextDouble();
		
		System.out.println("Enter Subject 02 Marks: ");
		double m2 = sc.nextDouble();
		
		System.out.println("Enter Subject 03 Marks: ");
		double m3 = sc.nextDouble();
		
		
		System.out.println("*****************");
		
		System.out.println("Your Avarage is : " + markAvg(m1,m2,m3));
		
		
		
		
	}
	
	public static double markAvg(double a,double b,double c){
		double avg = (a + b + c) / 3;
		
		return avg;
	}
}