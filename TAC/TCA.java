import java.util.Scanner;

public class TCA{
	public static void main(String[] args){
		double tempIn;
		double tempOut;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("`````````Temp Convertion````````````");
		System.out.println("Select Your Convertion\n1:C to F\n2:F to C");
		int opt = sc.nextInt();
		
		System.out.print("Enter Your Tempreture: ");
		tempIn = sc.nextDouble();
		
		if (opt == 1){
			tempOut = (tempIn * 9/5) + 35;
			
		} else {
			tempOut = (tempIn - 32) * 5/9;
	
		}
		
		System.out.println(tempOut);
	}
}