public class S03Ex2{
	public static void main(String[] args){
		
		groceryStore Huston = new groceryStore();
		groceryStore Orleans = new groceryStore();
		groceryStore Seattle = new groceryStore();
		
		Huston.noApples = 534;
		Huston.priceApple = 0.99;
		Huston.noOrg = 429;
		Huston.priceOrg = 0.87;
		
		Seattle.noApples = 765;
		Seattle.priceApple = 0.86;
		Seattle.noOrg = 429;
		Seattle.priceOrg = 0.91;
		
		Orleans.noApples = 402;
		Orleans.priceApple = 0.77;
		Orleans.noOrg =398;
		Orleans.priceOrg = 0.79;
		
		System.out.println("Huston Store Gross Revenue is: " + Huston.calculateGrossRevenu() + " Rs");
		
		System.out.println("To Earn $1050 for the Huston store you need to sell " + Huston.appleRevenuTarget(1050) + " Apples");
		System.out.println("To Earn $620 for the Seattle store you need to sell " + Seattle.orangeRevenuTargret(620) + " Oranges");
		System.out.println("To Earn $744 for the Seattle store you need to sell " + Orleans.appleRevenuTarget(744) + " Apples");
	
	}
}

class groceryStore{
	double grossRevenu;
	int noApples;
	double priceApple;
	int noOrg;
	double priceOrg;
	
	double calculateGrossRevenu(){
		grossRevenu = (priceApple * noApples) + (priceOrg * noOrg);
		
		return grossRevenu;
	}
	
	int appleRevenuTarget(double target){
		double count = target / priceApple;
		int countI = (int) count;
		return countI;
	}
	
	
	int orangeRevenuTargret(double target){
		double count = target / priceOrg;
		int countI = (int) count;
		return countI;
	}
	
}