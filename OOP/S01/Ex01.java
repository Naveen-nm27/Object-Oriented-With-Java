import java.util.Scanner;  
  //Ex01
  
  
  public class Ex01 {
	  public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Select a Season \n1.Speing\n2.Summer\n3.Fall\n4.Winter\n***************");
		  int opt = sc.nextInt();
		  
		  switch(opt){
			case 1:
				printSpring();
				break;
			case 2:
				printSummer();
				break;
			case 3:
				printFall();
				break;
			case 4:
				printWinter();
				break;
			default:
				System.out.println("Select a Valid Number");
		  }
	  }
	  
	  public static void printSpring(){
		  System.out.println("Season is Spring");
		  System.out.println("**************");
		  System.out.println("A Light exists in Spring Not present on the Year...\nAt any other period When March is scarcely here..");
		  System.out.println("**************");
	  }
	  
	  public static void printSummer(){
		      System.out.println("**************");
			  System.out.println("Season is Summer");
			  System.out.println("**************");
			  System.out.println("A Something in a Summer's Day... \nAs slow her Flambeaux burn away...\nWhich solemnizes even Play... \nAnd hints at the Eternity...");
			  System.out.println("**************");
	  }
	  
	  public static void printFall(){
		  System.out.println("**************");
		  System.out.println("Season is Fall");
		  System.out.println("**************");
		  System.out.println("As imperceptibly as Grief...\nThe Summer lapsed away...\nToo imperceptible at most...\nTo know the Summer Day...");
		  System.out.println("**************");
	  }
	  
	  public static void printWinter(){
		  System.out.println("**************");
		  System.out.println("Season is Winter");
		  System.out.println("**************");
		  System.out.println("The Snow that never drifts..\nThe transient, fragrant...\nSnow That on a cheek a film of Death Instantly lay away...");
		  System.out.println("**************");
	  }
  }
  
