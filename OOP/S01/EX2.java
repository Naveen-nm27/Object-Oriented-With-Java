import java.util.Scanner;

public class EX2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers between 1  and 100");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	if ((num1 > 100 || num1 < 1) || (num2 > 100 || num2 < 1)){
		System.out.println("Number Must be between 1  and 100");
	}else{
		System.out.println("Larger number is :" + numCom(num1, num2));
	}
	}
	
	public static int numCom(int a,int b){
		if (a > b){
			return a;
		} else {
			return b;
		} 
		
	}
	
}