public class S03Ex1{
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
		
		System.out.println("Huston Store\n-------------------\nApples Sold: " + Huston.noApples + "\nApple Retail Cost: "+Huston.priceApple+"\n\nOranges Sold: "+Huston.noOrg+"\nOrange Retail Price: "+Huston.priceOrg);
		
		System.out.println("\nHuston Store");
		Huston.calculateGrossRevenu();
		System.out.println("Seattle Store");
		Seattle.calculateGrossRevenu();
		System.out.println("Orleans Store");
		Orleans.calculateGrossRevenu();

	}
}

class groceryStore{
	double grossRevenu;
	int noApples;
	double priceApple;
	int noOrg;
	double priceOrg;
	
	void calculateGrossRevenu(){
		grossRevenu = (priceApple * noApples) + (priceOrg * noOrg);
		
		System.out.println("Gross Revenu: " + grossRevenu + " Rs");
	}
}