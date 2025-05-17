public class S03Ex10{
	public static void main(String[] args){
	
		groceryStore Huston = new groceryStore(534,0.99,429,0.87);
		groceryStore Orlens = new groceryStore();
		groceryStore Seattel;
		Seattel = new groceryStore;
		
		System.out.println("Huston Store Gross Revenue is: " + Huston.calculateGrossRevenu() + " Rs");
		
		System.out.println("To Earn $1050 for Apples the Huston store you need to sell " + Huston.appleRevenuTarget(1000) + " Apples");
		System.out.println("To Earn $800 for Oranges the Huston store you need to sell " + Huston.orangeRevenuTargret(800) + " Apples");
		
		
		
		
	}
}

		
class groceryStore{
	double grossRevenu;
	int noApples;
	double priceApple;
	int noOrg;
	double priceOrg;
	
	groceryStore(int numa,double pa,int numO,double po){
		noApples = numa;
		priceApple = pa;
		noOrg = numO;
		priceOrg = pa;
	}
	
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
