import java.util.Scanner;
import javax.swing.*;
public class Main {
	public static void main(String[] args){
		//3
		
		/*
		String X = "Water";
		String Y = "Kool-aid";
		String temp;
		
		temp=X;
		X=Y;
		Y=temp;
		
		
		System.out.println("X:"+X);
		System.out.println("Y:"+Y);
		*/
		
		//4
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is Your Name ");
		String Name = scanner.nextLine();
		System.out.println("What is Your Age: ");
		int Age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is Your Favourite Food: ");
		String Food = scanner.nextLine();
		
		
		System.out.println("Hello "+ Name + " You are "+Age+"Years old");
		*/
		/*
		int Friends = 10;
		
		Friends = Friends + 1;
		
		System.out.println(Friends);
		*/
		
		String name	= JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null,"Hello "+name);
		
	}
}